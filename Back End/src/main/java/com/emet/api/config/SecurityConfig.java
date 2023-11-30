package com.emet.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.emet.api.Jwt.JwtAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration // Le avisa a spring que esta clase es de configuracion y puede contener la
               // anotacion @Bean
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

        final JwtAuthenticationFilter jwtAuthenticationFilter;
        final AuthenticationProvider authProvider;

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

                return http
                                // Lo saco para poder tener mis propios tokens
                                .csrf(AbstractHttpConfigurer::disable)
                                // todas las rutas necesitan autenticacion excepto las de /auth/**
                                .authorizeHttpRequests(authRequest -> authRequest
                                                .requestMatchers("/auth/**", "/api/upload").permitAll()
                                                .anyRequest().authenticated())
                                // .formLogin(withDefaults()) Ofrece un formulario de login basico
                                .sessionManagement(sessionManager -> sessionManager
                                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                                .authenticationProvider(authProvider)
                                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                                .build();
        }
}
