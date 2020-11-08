package models;

public class Minerals {
    private int id;
    private String name;
    private String brand;
    private int qty;
    private float price;

    public Minerals(int id, String name, String brand, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }

    public Minerals() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
