package arrays;

public class ArrayBasics {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 5, 40, 50 };

		System.out.println(numbers[0]);

		System.out.println(numbers[2]);

		System.out.println(numbers[4]);

		System.out.println(numbers.length);

		System.out.println("Print with for-Loop");

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
		
		System.out.println("Loop to Calculate Sum");
		
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++){
			int currentNumber = numbers[i];
			int currentSum = currentNumber+sum;
			sum = currentSum;
		}
		System.out.println(sum);
		
		System.out.println("Find Largest Number");
		
		int largest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			
		}
		System.out.println(largest);
		
		System.out.println("Find Smallest Number");
		
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			
			if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println(smallest);
		
		System.out.println("Even number counter");
		
		int count =0;
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
