package se.iths.lukas.labb1.model;

public class ButtonCounter {
    private int count;

    public ButtonCounter(int count) {
        this.count = count;
    }

    public void incrementCount() {
        setCount(this.getCount() + 1);
    }

    public String printCount() {
        return getCount() + "";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
