import java.math.BigInteger;

/**
 * 1000-digit Fibonacci number
 * Problem 25
 * 
 * The Fibonacci sequence is defined by the recurrence relation: Fn = Fn-1 +
 * Fn-2, where F1 = 1 and F2 = 1. Hence the first 12 terms will be: F1 = 1 F2 =
 * 1 F3 = 2 F4 = 3 F5 = 5 F6 = 8 F7 = 13 F8 = 21 F9 = 34 F10 = 55 F11 = 89 F12 =
 * 144 The 12th term, F12, is the first term to contain three digits. What is
 * the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class PE025_1000_digit_Fibonacci_number {
	public static void main(String[] args) {
		long start = System.nanoTime();

		BigInteger bi1 = BigInteger.ONE;
		BigInteger bi2 = BigInteger.ONE;
		BigInteger t;

		for (int i = 0; i < 1000000; i++) {
			t = bi1.add(bi2);
			bi1 = bi2;
			bi2 = t;
			String total = t.toString();
			int j = total.length();
			if (j == 1000) {
				System.out.println(i + 3);
				break;
			}
		}

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
