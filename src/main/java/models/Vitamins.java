package models;

public class Vitamins {
    private String name;
    private String brand;
    private int qty;
    private float price;

    public Vitamins(String name, String brand, int qty, float price) {
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }

    public Vitamins() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
