package java_oop;

import java.util.Scanner;

public class ScannerDemo {
								
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter name");
	String name = sc.nextLine();
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	
	System.out.println("Enter Percentage");
	double percentage = sc.nextDouble();
	
	System.out.println("Enter Grade");
	char grade = sc.next().charAt(0);
	
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Percentage = "+percentage);
	System.out.println("Grade = "+grade);
	
	}
	
}
