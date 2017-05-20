package lab1b.starting.code;

public class Lab1bStartingCode {

    public static void main(String[] args) {

        Product[] products = new Product[4];

        // TODO create two necessary and two luxury products and add them to
        // the products array
        double total = 0;
        for (Product p : products) {
            // TODO print out each product
            total += p.getTotalPrice();
        }

        // TODO display the total cost, rounded to the nearest cent 
    }

}
