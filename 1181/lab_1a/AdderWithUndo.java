package lab_1a;

public class AdderWithUndo extends Adder {
	private int lastValueAdded;

	/*
	 * an empty constructor is automatically implied but the pdf wants an
	 * explicitly defined one
	 */
	public AdderWithUndo() {

	}

	public void add(int value) {
		this.lastValueAdded = value;
		super.add(value);
	}

	public void undo() {
		super.add(-1 * lastValueAdded);
	}
}
