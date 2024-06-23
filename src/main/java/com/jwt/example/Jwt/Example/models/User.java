package com.jwt.example.Jwt.Example.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private  String userId;
    private String name;
    private String email;
}
