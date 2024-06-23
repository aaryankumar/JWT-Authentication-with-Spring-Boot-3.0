package com.jwt.example.Jwt.Example.security;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

@Component //@Component annotations is used for @Autowired annotation in any class for dependency injection
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        //this method will execute whenever a non-authenticated user will try to access the API
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        PrintWriter writer=response.getWriter();
        writer.println("Access denied" + authException.getMessage());
    }
}
