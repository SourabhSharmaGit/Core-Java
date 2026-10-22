package strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Hanuman";
		
		for(int i=1; i<=name.length(); i++) {
			char a = name.charAt(name.length()-i);
			System.out.print(a);
			
		}
	}
}
