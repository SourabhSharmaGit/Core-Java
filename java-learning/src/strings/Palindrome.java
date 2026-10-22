package strings;

public class Palindrome {

	// same pronounce from both forward and reverse reading pattern

	public static void main(String[] args) {

		String name = "madam";
		boolean isPalindrome = true;

		for (int i = 0; i <= name.length() - 1; i++) {

			char x = name.charAt(i);
			char y = name.charAt(name.length() - 1 - i);

			if (x != y) {
				isPalindrome = false;

			}
		}
		System.out.println(isPalindrome);
	}
}