package control_flow;

public class ContinueTheLoop {

	// skipping 5th number and continue the loop

	public static void main(String[] args) {

		int i = 0;

		while (i <= 9) {
			
			
			i++;
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
