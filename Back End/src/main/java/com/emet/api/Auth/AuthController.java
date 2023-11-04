package com.emet.api.Auth;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        try {
            return new ResponseEntity<>(
                    authService.login(request),
                    HttpStatus.CREATED);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(
                    errorResponse("The email and password fields are required."),
                    HttpStatus.BAD_REQUEST);
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(
                    errorResponse("Incorrect credentials"),
                    HttpStatus.BAD_REQUEST);
        } catch (UsernameNotFoundException e) {
            return new ResponseEntity<>(
                    errorResponse("User not found"),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        AuthResponse response;
        try {
            response = authService.register(request);
        } catch (DataIntegrityViolationException e) {
            return new ResponseEntity<>(errorResponse("A user with that email or username already exists."),
                    HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    private Map<String, String> errorResponse(String msg) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Error", msg);
        return errorResponse;

    }
}
