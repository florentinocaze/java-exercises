package br.com.florentino.oop.ex01productclass;

public class Product {
    private final String name;
    private double price;
    private int quantity;
    private double discount;

    public Product(String name, double price, int quantity) {
        this(name, price, quantity, 0);
    }

    public Product(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double applyDiscount() {
        return this.price - ((this.price * this.discount) / 100);
    }

    public double calculateTotalStockValue() {
        return this.price * this.quantity;
    }
}
