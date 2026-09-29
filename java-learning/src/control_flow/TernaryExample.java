package control_flow;

public class TernaryExample {

	
	public static void main(String[] args) {
		
		// Find if given number is even or odd
		
		int number = 15;
		
		String result = (number%2 == 0) ? "even" : "odd";
		
		System.out.println(result);
		
		// Industrial example
		
		boolean orderDeliverd = false;
		
		String status = (orderDeliverd) ? "Deliverd" : "InTransit";
		
		System.out.println(status);
	}
}


