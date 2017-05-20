package lab1b.starting.code;

public class LuxuryProduct extends Product {

	public LuxuryProduct(String name, double price) {
		super(name, price);
	}

	@Override
	public double getTotalPrice() {
		return this.getPrice() * 1.0575;
	}
	
}
