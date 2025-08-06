package com.guarani.siuguarani.utils;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTUtil {

    private final String SECRET = "esta-clave-es-re-contra-re-secreta-no-compartir-o-sino-se-autodestruye-el-codigo";
    private final long EXPIRATION_TIME = 3600000;

    private Key getKey() {
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }
    
    public String generateToken(String sub){
        try {
            return Jwts.builder()
                    .setSubject(sub)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .signWith(getKey(), SignatureAlgorithm.HS256)
                    .compact();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
        return null;
    }

    public boolean isTokenValid(String token) {
        try {
            Jwts.parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }

    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

}

