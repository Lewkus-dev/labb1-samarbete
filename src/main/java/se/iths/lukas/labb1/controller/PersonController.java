package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {
    Person person1 = new Person(1, "Freise"     , 32, "freise@openemail.com");
    Person person2 = new Person(2, "Erakmus"    , 28, "erakmus@openemail.com");
    Person person3 = new Person(3, "Stonifan"   , 62, "Stonifan@openemail.com");

    @GetMapping("/persons")
    public String showPersonInfo(Model model) {
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        model.addAttribute("personList", personList);
        return "persons";
    }
}
