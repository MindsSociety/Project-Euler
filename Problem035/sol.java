import java.util.Arrays;

/**
 * Circular primes
 * Problem 35
 * 
 * The number, 197, is called a circular prime because all rotations of the
 * digits: 197, 971, and 719, are themselves prime.
 * 
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71,
 * 73, 79, and 97.
 * 
 * How many circular primes are there below one million?
 */
public class sol {
	public static void main(String[] args) {
		int n = 10000001;
		boolean[] isprime = new boolean[n + 1];
		Arrays.fill(isprime, true);
		isprime[2] = true;
		isprime[3] = true;

		for (int i = 4; i < n; i += 2) {
			isprime[i] = false;
		}

		for (int i = 3; i < n; i += 2) {
			for (int j = i + i; j < n; j += i) {
				isprime[j] = false;
			}
		}

		int result = 1;
		
		for (int i = 3; i < n; i += 2) {
			if (isprime[i]) {
				int pow = 1;
				int j = i;
				int digits = 1;

				while (j >= 10) {
					j /= 10;
					pow *= 10;
					digits++;
				}

				int rot = i;
				boolean circ = true;

				for (j = 0; j < digits && circ; ++j) {
					if (!isprime[rot]) {
						circ = false;
					}

					int last = rot % 10;
					rot = rot / 10 + last * pow;
				}

				if (circ) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
