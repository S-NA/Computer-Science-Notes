package lab_1a;

public class Lab_1a {
	public static void main(String[] args) {
		Adder a1 = new Adder();
		System.out.println(a1);
		a1.add(5);
		System.out.println(a1);
		a1.add(-2);
		System.out.println(a1);
		
	    AdderWithUndo a2 = new AdderWithUndo();
	    System.out.println(a2);
	    a2.add(14);
	    System.out.println(a2);
	    a2.add(2);
	    System.out.println(a2);
	    a2.undo();
	    System.out.println(a2);
	    a2.undo();
	    System.out.println(a2);
	}
}
