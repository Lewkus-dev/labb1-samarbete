package se.iths.lukas.labb1.model;

public class Animal {
    private String species;
    private int numberOfLegs;
    private boolean flying;
    private String strategy;

    public Animal(String species, int numberOfLegs, boolean flying, String strategy) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.flying = flying;
        this.strategy = strategy;
    }

    public Animal() {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", flying=" + flying +
                ", strategy='" + strategy + '\'' +
                '}';
    }
}

