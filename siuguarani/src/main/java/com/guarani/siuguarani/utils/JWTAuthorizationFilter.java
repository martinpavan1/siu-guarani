package com.guarani.siuguarani.utils;

import java.io.IOException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTAuthorizationFilter extends OncePerRequestFilter{
    @Autowired
    JWTUtil jwtUtil;
    

    private static final String HEADER_AUTHORIZATION = "Authorization";
    private static final String TOKEN_BEARER_PREFIX = "Bearer ";

    @Override
   protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException{
        try {
            String header = request.getHeader(HEADER_AUTHORIZATION);
            if(header != null && header.startsWith(TOKEN_BEARER_PREFIX)){
                String token = header.replace(TOKEN_BEARER_PREFIX,"");

                if(jwtUtil.isTokenValid(token)){
                    String username = jwtUtil.extractUsername(token);
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, null, Collections.emptyList());

                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al validar el token: " + e.getMessage());
        }
        filterChain.doFilter(request, response);
   }

   
    
}
