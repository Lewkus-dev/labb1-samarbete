package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Plant;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlantController {
    Plant plant1 = new Plant("Banana", "yellow", true, false);
    Plant plant2 = new Plant("Potato", "white", false, true);
    Plant plant3 = new Plant("Magnolia", "magenta", false, false);


    @GetMapping("/plants")
    public String showPlantsInfo(Model model) {
        List<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        model.addAttribute("plants", plants);
        return "plants";
    }
}
