package se.iths.lukas.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.lukas.labb1.model.Movie;

import java.util.List;


@Controller
public class MovieController {
    @GetMapping("/movies")
    public String getMovies(Model model) {
        List<Movie> movies = List.of(
                new Movie("Twilight", 2010, "Drama"),
                new Movie("Interstellar", 2012, "Sci-fi"),
                new Movie("Harry Potter", 2014, "Fantasy")
        );

        model.addAttribute("movies", movies);
        return "movies";
    }
}
