package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Controller
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/users")
    public String showUserInfo(Model model) {
        User user1 = new User(1, "David", "david@mail.com");
        User user2 = new User(2, "Alice", "alice@mail.com");
        User user3 = new User(3, "Mike", "mike@mail.com");
        Collections.addAll(users, user1, user2, user3);
        model.addAttribute("users", users);
        return "users";
    }

}
