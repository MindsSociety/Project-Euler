/**
 * Double-base palindromes
 * Problem 36
 * 
 * The decimal number, 585 = 1001001001_2 (binary), is palindromic in both bases.
 * 
 * Find the sum of all numbers, less than one million, which are palindromic in
 * base 10 and base 2.
 * 
 * (Please note that the palindromic number, in either base, may not include
 * leading zeros.)
 */
public class sol {
	public static void main(String[] args) {
		String base2, base10;
		int result = 0;

		for (int i = 1; i < 1000000; i += 2) {
			base2 = Integer.toString(i, 2);
			base10 = String.valueOf(i);

			if (isPalindrome(base2) && isPalindrome(base10)) {
				result += i;
			}
		}

		System.out.println(result);
	}

	private static boolean isPalindrome(String s) {
		boolean isPal = true;
		
		for (int i = 0; i < s.length() / 2 && isPal; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				isPal = false;
			}
		}
		
		return isPal;
	}
}
