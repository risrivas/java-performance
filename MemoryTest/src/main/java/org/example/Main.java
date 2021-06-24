package org.example;

public class Main {

	public static void main(String args[]) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C"); // initial = C
		another(container,last);

		// B as copy reference initialHolder was marked to initial2 and
		// lost after another() returned
		System.out.print(container.getInitial());

		// final output = AZB
		// actual output = AZB
	}
	
	public void another(Container initialHolder, String newInitial) {
		// initialHolder = C
		// newInitial = Z
		newInitial.toLowerCase(); // no effect
		initialHolder.setInitial("B"); // B
		Container initial2 = new Container();
		initialHolder=initial2; // A
		System.out.print(initialHolder.getInitial()); // A
		System.out.print(newInitial); // Z
	}
}
