package se.iths.lukas.labb1.model;

public class Movie {
    private String title;
    private int year;
    private String Genre;

    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        Genre = genre;
    }

    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getGenre() {
        return Genre;
    }
}
