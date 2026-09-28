package java_oop;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter City:");
		String city = sc.nextLine();
		
		System.out.println("Enter Student 1 Percentage:");
		double percentage1 = sc.nextDouble();
		
		System.out.println("Enter Student 2 Percentage:");
		double percentage2 = sc.nextDouble();
		
		System.out.println("Enter Grade:");
		char grade = sc.next().charAt(0);
		
		System.out.println();
		System.out.println("=======Student Info=======");
		System.out.println();
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("City = "+city);
		
		double averagePercentage = (percentage1 + percentage2)/2;
		
		System.out.println("Average Percentage = "+averagePercentage);
		System.out.println("Grade = "+grade);
		
	}
}
