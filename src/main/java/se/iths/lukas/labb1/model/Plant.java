package se.iths.lukas.labb1.model;

public class Plant {
    private String name;
    private String flowers;
    private boolean fruits;
    private boolean poison;

    public Plant(String name, String flowers, boolean fruits, boolean poison) {
        this.name = name;
        this.flowers = flowers;
        this.fruits = fruits;
        this.poison = poison;
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    public boolean isFruits() {
        return fruits;
    }

    public void setFruits(boolean fruits) {
        this.fruits = fruits;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", flowers='" + flowers + '\'' +
                ", fruits=" + fruits +
                ", poison=" + poison +
                '}';
    }
}
