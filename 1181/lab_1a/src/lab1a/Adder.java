package lab1a;

public class Adder {
	private int total;

	/*
	 * an empty constructor is automatically implied but the pdf wants an
	 * explicitly defined one
	 */
	public Adder() {

	}

	public void add(int value) {
		this.total += value;
	}

	@Override
	public String toString() {
		return "Total=" + total;
	}
}
