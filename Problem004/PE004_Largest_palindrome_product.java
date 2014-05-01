/**
 * Largest palindrome product
 * Problem 4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 */

public class PE004_Largest_palindrome_product {
	public static void main(String args[]) {
		long start = System.nanoTime();

		int result = 0, product = 0;
		String palindrome = "";
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				product = i * j;
				palindrome = String.valueOf(product);
				if (new StringBuffer(palindrome).reverse().toString()
						.equals(palindrome)
						&& product > result) {
					result = product;
				}
			}
		}

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
