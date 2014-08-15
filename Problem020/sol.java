import java.math.BigInteger;

/**
 * Factorial digit sum
 * Problem 20
 * 
 * n! means n * (n - 1) * ... * 3 * 2 * 1 For example, 10! = 10 * 9 * ... * 3 *
 * 2 * 1 = 3628800, and the sum of the digits in the number 10! is 3 + 6 + 2 + 8
 * + 8 + 0 + 0 = 27. Find the sum of the digits in the number 100!
 */
public class sol {
	public static void main(String[] args) {
		BigInteger bi1 = BigInteger.valueOf(100);
		int result = 0;

		for (int i = 99; i > 0; i--) {
			BigInteger bi2 = BigInteger.valueOf(i);
			bi1 = bi1.multiply(bi2);
		}
		
		String big = bi1.toString();

		for (int i = 0; i < big.length(); i++) {
			result += Integer.parseInt(big.substring(i, i + 1));
		}

		System.out.println(result);
	}
}
