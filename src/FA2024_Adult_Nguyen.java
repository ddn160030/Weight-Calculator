//FA2024_Adult_Nguyen

public class FA2024_Adult_Nguyen {
    private String name;
    private float height;
    private double bmi;
    private double weight;

    //Input Constructor
    public FA2024_Adult_Nguyen() {
        this.name = "";
        this.height = 0;
        this.bmi = 0;
    }
// Getters and setters for input values
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public void calculateWeight() {
        this.weight = bmi * (height * height) / 703;
    }

    public double getWeight() {
        return weight;
    }
}