package arrays;

public class Array2D {

	public static void main(String[] args) {

		int[][] matrix = { 	{ 1, 2, 3 }, 
							{ 4, 5, 6 },
							{ 7, 8, 9 } 
						 };
		
		System.out.println(matrix[0][0]);
		System.out.println(matrix[1][1]);
		System.out.println(matrix[2][2]);
		
		//Print whole 2d array
		
		System.out.println("Print whole 2d array");
		
		for(int i=0; i<3; i++) {
					
			
			for(int j=0; j<3; j++) {
				
			System.out.print(" "+matrix[i][j]);
			
			}
			System.out.println();
		}
		
		// Sum of all elements in 2D array
		
		System.out.println("Sum of all elements in 2D array");
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				int currentNumber = matrix[i][j];
				int currentSum = currentNumber+sum;
				sum = currentSum;
			}
		}
		System.out.println(sum);
	}

}
