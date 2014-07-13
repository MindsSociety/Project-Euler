/**
 * Largest prime factor
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 */
public class sol {
	public static void main(String[] args) {
		long input = 600851475143L, result = 0L;
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

		for (int i = 2; i < limit; ++i) {
			if (!isPrime[i] && (input % i) == 0) {
				result = Math.max(i, result);
			}
		}

		System.out.println(result);
	}
}
