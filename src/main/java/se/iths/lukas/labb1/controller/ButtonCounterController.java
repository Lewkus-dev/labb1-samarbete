package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/counter")
public class ButtonCounterController {

    @GetMapping("/counter")
    public void counter(Model model) {
        return;
    }
}
