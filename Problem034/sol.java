/**
 * Digit factorials
 * Problem 34
 * 
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * 
 * Find the sum of all numbers which are equal to the sum of the factorial of
 * their digits.
 * 
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */
public class sol {
	public static void main(String[] args) {
		long result = 0;
		int[] fact = new int[10];

		for (int i = 0; i < 10; ++i) {
			fact[i] = 1;

			for (int j = 2; j <= i; ++j) {
				fact[i] = fact[i] * j;
			}
		}

		for (int i = 3; i < 10000000; ++i) {
			String digits = Integer.toString(i);
			long num = 0;

			for (int j = 0; j < digits.length(); ++j) {
				char c = digits.charAt(j);
				int digit = (int) (c - '0');
				num += fact[digit];
			}

			if (num == i) {
				result += i;
			}
		}

		System.out.println(result);
	}
}
