package lab1b.starting.code;


public abstract class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f", name, price);
    }

    public double getPrice() {
        return price;
    }

    public abstract double getTotalPrice();
}
