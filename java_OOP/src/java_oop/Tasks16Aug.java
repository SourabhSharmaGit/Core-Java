package java_oop;

public class Tasks16Aug {

	public static void main(String[] args) {

		// Print even number upto 20
		for (int i = 2; i <= 20; i += 2) // i=i+2 can be return {

			System.out.println(i);

		// find grade according to marks

		int marks = 85;

		if (marks >= 90) {
			System.out.println("A");

		} else if (marks >= 80) {
			System.out.println("B");

		} else if (marks >= 70) {
			System.out.println("C");

		} else if (marks >= 60) {
			System.out.println("D");

		} else {
			System.out.println("F");
		}

		// Switch case

		int choice = 2;

		switch (choice) {

		case 1:
			System.out.println("Add");
			break;

		case 2:
			System.out.println("View");
			break;

		case 3:
			System.out.println("Delete");
			break;

		case 4:
			System.out.println("Exit");
			break;

		default:
			System.out.println("Invalid choice");

		}

		// Ternary operator

		int age = 20;

		String result = age >= 18 ? "Eligible" : "Not Eligible";

		System.out.println(result);

		// continue + break example

		for (int i = 1; i <= 20; i++) {

			if (i == 15) {
				break;
			}

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		// Number classification

		int number = -8;

		if (number > 0) {
			System.out.println("Positive");
			
		} else if (number < 0) {
			System.out.println("Negative");

		} else {
			System.out.println("Zero");
		}
	}
}
