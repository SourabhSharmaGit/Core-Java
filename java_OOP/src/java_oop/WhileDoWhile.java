package java_oop;

public class WhileDoWhile {

	public static void main(String[] args) {

		// printing numbers 1 to 5 using while and do while loop

		int i = 1;

		while (i <= 5) {
			System.out.println("while :- " + i);
			i++;
		}
		System.out.println();
		i = 10;
		do {
			System.out.println("do while:- " + i);
			i++;

		} while (i <= 5);
	}
}
