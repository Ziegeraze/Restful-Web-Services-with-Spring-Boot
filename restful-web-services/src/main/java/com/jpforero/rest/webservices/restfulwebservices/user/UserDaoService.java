package com.jpforero.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Jhon", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Peter", LocalDate.now().minusYears(30)));
        users.add(new User(3,"Eve", LocalDate.now().minusYears(30)));
    }

    public List<User> findAll() {
        return users;
    }
}
