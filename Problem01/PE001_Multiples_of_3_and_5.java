/**
 * Multiples of 3 and 5
 * Problem 1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 */
public class PE001_Multiples_of_3_and_5 {
	public static void main(String[] args) {
		long start = System.nanoTime();

		int result = 0;
		
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
