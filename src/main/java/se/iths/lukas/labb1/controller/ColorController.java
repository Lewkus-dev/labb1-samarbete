package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class ColorController {
    @GetMapping("/colors")
    public String showColors(Model model){
        List<Color> colors = new ArrayList<>();
        Color red = new Color("red","#FF0000",0.5);
        Color green= new Color("green","#00FF00", 0.4);
        Color blue= new Color("blue","#0000FF",0.3);

        Collections.addAll(colors, red, green, blue);
        model.addAttribute("colors", colors);
        return "colors";
    }
}
