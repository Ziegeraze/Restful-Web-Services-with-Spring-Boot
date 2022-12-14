package com.jpforero.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Jhon", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Peter", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(30)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveOne(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public boolean deleteUserById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.removeIf(predicate);
    }

}
