/**
 * Digit fifth powers
 * Problem 30
 * 
 * Surprisingly there are only three numbers that can be written as the sum of
 * fourth powers of their digits:
 * 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * 
 * As 1 = 1^4 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth
 * powers of their digits.
 */
public class sol {
	public static void main(String[] args) {
		int result = 0;

		for (int i = 2; i < 1000000; ++i) {
			String digits = Integer.toString(i);
			int num = 0;

			for (int j = 0; j < digits.length(); ++j) {
				char c = digits.charAt(j);
				int digit = (int) (c - '0');
				int pow5 = digit * digit;
				pow5 = digit * pow5 * pow5;
				num += pow5;
			}

			if (num == i) {
				result += i;
			}
		}

		System.out.println(result);
	}
}
