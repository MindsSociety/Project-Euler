import java.util.Vector;

/**
 * Amicable numbers
 * Problem 21
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a != b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class PE021_Amicable_numbers {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int result = 0;
		Vector<Integer> pairs = new Vector<Integer>();

		for (int i = 1; i < 10000; i++) {
			if (properDivisors(properDivisors(i)) == i
					&& properDivisors(i) < 10000 && i != properDivisors(i)) {
				if (!pairs.contains(i)) {
					pairs.add(i);
				}
			}
		}

		for (int i = 0; i < pairs.size(); i++) {
			result += pairs.elementAt(i);
		}
		
		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}

	private static long properDivisors(long num) {
		long total = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total += i;
			}
		}
		return total;
	}
}
