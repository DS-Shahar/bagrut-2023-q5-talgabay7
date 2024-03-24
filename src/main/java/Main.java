
public class Main {

	public static void main(String[] args) {

		// Prepare everything
		// ==================
		OrderedList t = new OrderedList();
		for (int i = 0; i < 9; i++) {
			t.insertNum(3);
		}
		t.insertNum(5);
		t.insertNum(8);
		t.insertNum(8);
		System.out.println(t);

		
		// TESTS and PRINTS
		// ================

		// existing node
		t.insertNum(5);
		System.out.println(t);

		// new node
		t.insertNum(4);
		System.out.println(t);

		// before first node
		t.insertNum(1);
		System.out.println(t);

		// after last node
		t.insertNum(10);
		System.out.println(t);

		// valueN
		System.out.println("valueN of 7: " + t.valueN(7));

		// decrement existing
		t.removeNum(5);
		System.out.println(t);

		// remove node
		t.removeNum(4);
		System.out.println(t);

		// remove first
		t.removeNum(1);
		System.out.println(t);

		// remove last
		t.removeNum(10);
		System.out.println(t);

	}

}
