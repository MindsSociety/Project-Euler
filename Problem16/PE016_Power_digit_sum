import java.math.BigInteger;

/**
 * Power digit sum
 * Problem 16
 * 
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26. What is the
 * sum of the digits of the number 2^1000?
 */
public class PE016_Power_digit_sum {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		BigInteger bi1 = BigInteger.valueOf(2);
		bi1 = bi1.pow(1000);
		String big = bi1.toString();
		int result = 0;

		for (int i = 0; i < big.length(); i++) {
			result += Integer.parseInt(big.substring(i, i + 1));
		}

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
