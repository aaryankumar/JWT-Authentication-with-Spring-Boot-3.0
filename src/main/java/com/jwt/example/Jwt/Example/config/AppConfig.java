package com.jwt.example.Jwt.Example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        //It is pre-defined interface in springboot which has loadUserByUsername() function
        //which takes the username of user and  fetches the data about user authentication
        UserDetails user= User.builder().username("harsh").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
        UserDetails user1= User.builder().username("aarya").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
        //UserDetails is a pre-defined interface. User is also a pre-defined class.
        //UserDetails interface has many methods like getPassword(), getUsername(), isAccountNonExpired(), etc.
        //User is a pre-defined class which has the fields like Password, Username, etc.
        return new InMemoryUserDetailsManager(user,user1);
        //any number of users can be passed in the function parameters in InMemoryUserDetailsManager() function
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
