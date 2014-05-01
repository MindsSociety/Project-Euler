/**
 * Largest prime factor
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 */
public class PE003_Largest_prime_factor {
	public static void main(String[] args) {
		long start = System.nanoTime();

		long input = 600851475143L;
		int limit = (int) Math.sqrt(input) + 1;
		boolean[] isPrime = new boolean[limit + 1];

		for (int i = 4; i < limit; i += 2) {
			isPrime[i] = true;
		}

		for (int i = 3; i < limit; i += 2) {
			for (int j = i + i; j < limit; j += i) {
				isPrime[j] = true;
			}
		}

		long result = 0L;

		for (int i = 2; i < limit; ++i) {
			if (!isPrime[i] && (input % i) == 0) {
				result = Math.max(i, result);
			}
		}

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
