package com.guarani.siuguarani.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.guarani.siuguarani.utils.JWTAuthorizationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private JWTAuthorizationFilter jwtFilter; 

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        .cors(cors -> cors.configurationSource(this.corsConfigurationSource()))
        .csrf(crsf -> crsf.disable()) // Desactiva CSRF (útil para desarrollo sin formularios)
        .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()))
        .authorizeHttpRequests(auth -> auth
        .requestMatchers(HttpMethod.POST,"/h2-console/**").permitAll() // Permite acceso a h2-console sin autenticación
        .requestMatchers("/h2-console/login.do").permitAll()
        .requestMatchers("/acceso").permitAll() 
        .anyRequest().authenticated()
        )
        .formLogin(form -> form.disable()
        .addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class)
            );
        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:4200")); // Cambia esto si lo necesitas
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(true); // importante si usas cookies o Authorization headers

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // Aplica CORS a todo
        return source;
    }
    
    }


