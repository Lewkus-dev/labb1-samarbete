package se.iths.lukas.labb1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Game;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {

    @GetMapping("/games")
    public String game(Model model) {
        List<Game> games = List.of(
                new Game("League of Legends", "PC", 9),
                new Game("Skyrim", "PC", 10),
                new Game("God of War", "Xbox", 6)
        );
        model.addAttribute("games", games);
        return "games";
    }
}
