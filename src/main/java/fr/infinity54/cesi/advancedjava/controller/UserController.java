package fr.infinity54.cesi.advancedjava.controller;

import fr.infinity54.cesi.advancedjava.dao.UserDao;
import fr.infinity54.cesi.advancedjava.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    protected UserDao userDao;

    @Autowired
    public UserController(final UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        try {
            return userDao.findById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

}
