package com.jwt.example.Jwt.Example.services;
import com.jwt.example.Jwt.Example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store= new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Aarya","aaryan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"gautan","gatm@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"jan","jan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"tom","tom@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
