package se.iths.lukas.labb1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Book;

import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = List.of(
                new Book("Bible", "Jesus Christ", "123-123"),
                new Book("IT-HS", "Håkan Gleissman", "123-124"),
                new Book("Azure Guidelines", "Kevin Dübois", "123-125")
        );

        model.addAttribute("books", books);
        return "books";
    }
}
