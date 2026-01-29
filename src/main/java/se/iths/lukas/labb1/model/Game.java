package se.iths.lukas.labb1.model;

public class Game {
    private String title;
    private String platform;
    private int rating;

    public Game(String title, String platform, int rating) {
        this.title = title;
        this.platform = platform;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public String getPlatform() {
        return platform;
    }
    public int getRating() {
        return rating;
    }
}
