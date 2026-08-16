package java_oop;

public class breakTheLoop {

	public static void main(String[] args) {
		
		//break the loop at 7
		
		int i =1;
		
		while(i <=10) {
			System.out.println(i);
			i++;
			if(i == 7) {
				break;
			}
			
		}
	}
}
