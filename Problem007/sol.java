/**
 * 10001st prime
 * Problem 7
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13. What is the 10,001st prime number?
 */
public class sol {
	public static void main(String[] args) {
		int j, counter = 0, result = 0;

		for (int i = 2; i < 110000; i++) {
			if (i % 2 != 0 || i == 2) {
				for (j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						break;
					}
				}

				if (j > i / 2) {
					counter++;

					if (counter == 10001) {
						result = i;
						break;
					}
				}
			}
		}

		System.out.println(result);
	}
}
