package com.jo.cscinfdel.security;

import com.jo.cscinfdel.model.Usuarios;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import static com.jo.cscinfdel.security.Constants.*;

@Component
public class JwtTokenUtil implements Serializable {


    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public Integer getUsuarioCodigoFromToken(String token) {
        return this.getClaimFromToken(token, claims -> (Integer) claims.get("usuarioCodigo"));
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(SIGNING_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    public String generateToken(Usuarios usuarios) {

        Claims claims = Jwts.claims().setSubject(String.valueOf(usuarios.getUsuarioCodigo()));

        claims.put("usuarioCodigo", usuarios.getUsuarioCodigo());
        claims.put("usuarioNmbre", usuarios.getUsuarioNmbre());
        claims.put("usuarioContrasena", usuarios.getUsuarioContrasena());
        claims.put("usuarioEstado", usuarios.getUsuarioEstado());

        return TOKEN_PREFIX + Jwts.builder()
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + ACCESS_TOKEN_VALIDITY_SECONDS * 1000))
                .signWith(SignatureAlgorithm.HS256, SIGNING_KEY)
                .compact();
    }

    public Boolean validateToken(String token, Usuarios usuarios) {
        final Integer usuarioCodigoFromToken = getUsuarioCodigoFromToken(token);
        return (usuarioCodigoFromToken.equals(usuarios.getUsuarioCodigo()) && !isTokenExpired(token));
    }

}
