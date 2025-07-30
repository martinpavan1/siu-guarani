package com.guarani.siuguarani.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(crsf -> crsf.disable()) // Desactiva CSRF (útil para desarrollo sin formularios)
            .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.POST,"/h2-console/**").permitAll() // Permite acceso a h2-console sin autenticación
                .requestMatchers("/h2-console/login.do").permitAll() 
                .anyRequest().permitAll() // Permite cualquier request sin autenticación
            );
        return http.build();
    }
    }


