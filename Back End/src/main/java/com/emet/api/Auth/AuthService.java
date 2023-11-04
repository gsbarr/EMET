package com.emet.api.Auth;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.emet.api.Jwt.JwtService;
import com.emet.api.User.Role;
import com.emet.api.User.User;
import com.emet.api.User.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    // private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        UserDetails user = userRepository.findByEmail(request.getEmail()).orElse(null);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        if (passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            String token = jwtService.getToken(user);
            return AuthResponse.builder()
                    .token(token)
                    .build();
        }

        throw new BadCredentialsException("Incorrect Credentials");
    }

    public AuthResponse register(RegisterRequest request) {
        if (userRepository.findByEmail(request.getEmail()) == null) {
            return null;
        }
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .role(Role.USER)
                .build();

        userRepository.save(user);
        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
