package se.iths.lukas.labb1.model;

public class Color {
    private String colorName;
    private String hexCode;
    private double opacity;

    public Color() {
    }

    public Color(String colorName, String hexCode, double opacity) {
        this.colorName = colorName;
        this.hexCode = hexCode;
        this.opacity = opacity;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorName='" + colorName + '\'' +
                ", hexCode='" + hexCode + '\'' +
                ", opacity=" + opacity +
                '}';
    }
}
