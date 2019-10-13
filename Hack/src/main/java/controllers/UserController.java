package controllers;

import models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    List<User> all() {
        // return all users
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        // save user
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {
        // return single user by I.D
    }

    @PutMapping("/users/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Long id) {
        // replaces user
    }
}
