package lab1b.starting.code;

public class Lab1bStartingCode {

	public static void main(String[] args) {

		Product[] products = new Product[4];

		products[0] = new NecessaryProduct("Cheese", 1.50);
		products[1] = new LuxuryProduct("Soda", 3.50);
		products[2] = new NecessaryProduct("Bread", 2.25);
		products[3] = new LuxuryProduct("Candy", 2.00);
		
		double total = 0;
		for (Product p : products) {
			System.out.printf("%s\n", p.toString());
			total += p.getTotalPrice();
		}

		System.out.printf("\nThe total cost is $%.2f", total);
	}

}
