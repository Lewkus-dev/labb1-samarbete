package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.iths.lukas.labb1.model.User;

@Controller
public class UserController {
    @GetMapping("/users")
    public String showUserInfo( Model model){
        User user1 = new User(1, "David", "david@mail.com");
        User user2 = new User(2, "Alice","alice@mail.com");
        model.addAttribute("user1", user1);
        model.addAttribute("user2", user2);
        return "user";

    }
}
