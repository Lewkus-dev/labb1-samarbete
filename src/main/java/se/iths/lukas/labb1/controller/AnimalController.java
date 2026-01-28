package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Animal;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimalController {
    Animal animal1 = new Animal("Catepillar", 100, false, "hide");
    Animal animal2 = new Animal("Horse", 4, false, "run");
    Animal animal3 = new Animal("Eagle", 2, true, "attack");

    @GetMapping("/animals")
    public String showAnimalsInfo(Model model) {
        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        model.addAttribute(animals);
        return "animals";
    }
}
