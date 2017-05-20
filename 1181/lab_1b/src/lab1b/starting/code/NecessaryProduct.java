package lab1b.starting.code;

public class NecessaryProduct extends Product {

	public NecessaryProduct(String name, double price) {
		super(name, price);
	}

	@Override
	public double getTotalPrice() {
		return this.getPrice();
	}
}
