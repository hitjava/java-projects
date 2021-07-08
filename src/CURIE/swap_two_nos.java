package CURIE;

public class swap_two_nos {

	
	public static void main(String[] args) {
		float first = 3.50f, second = 6.50f;
		System.out.println("--Before swaping--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		float temporary = first;
		first = second;
		second = temporary;
		System.out.println("--After swaping--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

	}

}
