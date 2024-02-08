package cz.engeto.ja;

public class Computers {

    private String description;
    private int yearOfProdaction;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfProdaction() {
        return yearOfProdaction;
    }

    public void setYearOfProdaction(int yearOfProdaction) {
        this.yearOfProdaction = yearOfProdaction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Computers(String description, int yearOfProdaction, double price) {
        this.description = description;
        this.yearOfProdaction = yearOfProdaction;
        this.price = price;


    }
}
