package fr.infinity54.cesi.advancedjava.controller;

import fr.infinity54.cesi.advancedjava.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUserList() {
        ArrayList<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setFirstName("John");
        user1.setLastName("DOE");

        User user2 = new User();
        user2.setFirstName("Tony");
        user2.setLastName("STARK");

        users.add(user1);
        users.add(user2);

        return users;
    }

}
