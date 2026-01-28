package se.iths.lukas.labb1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String showCars(Model model){
        List<Car> cars= new ArrayList<>();
        Car car1= new Car("Tesla", "Y", 2026);
        Car car2= new Car("Benz", "X", 2025);
        Car car3= new Car("Toyota", "W", 2024);
        Collections.addAll(cars, car1, car2, car3);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
