package strings;

public class StringBasics {

	public static void main(String[] args) {
		String name = "Hanuman";
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(name.length()-1));
	}
}
