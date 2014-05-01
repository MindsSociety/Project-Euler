/**
 * Non-abundant sums
 * Problem 23
 * 
 * A perfect number is a number for which the sum of its proper divisors is
 * exactly equal to the number. For example, the sum of the proper divisors of
 * 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than
 * n and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest
 * number that can be written as the sum of two abundant numbers is 24. By
 * mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers. However, this upper limit
 * cannot be reduced any further by analysis even though it is known that the
 * greatest number that cannot be expressed as the sum of two abundant numbers
 * is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum
 * of two abundant numbers.
 */
public class PE023_Non_abundant_sums {
	public static void main(String[] args) {
		long start = System.nanoTime();

		System.out.println(new PE023_Non_abundant_sums().getAnswer());

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}

	public PE023_Non_abundant_sums() {
	}

	int limit = 28123;

	int[] abNums = new int[limit + 1];
	int[] nums = new int[limit + 1];
	boolean[] abundant = new boolean[limit + 1];
	int nAb = 0;

	public int getAnswer() {
		for (int i = 1; i <= limit; i++) {
			nums[i] = i;
			abundant[i] = isAbundant(i);
			if (abundant[i]) {
				abNums[nAb++] = i;
			}
		}
		for (int i = 1; i <= limit; i++) {
			int iAb = 0;
			while (iAb < nAb) {
				if (i - abNums[iAb] < 12) {
					break;
				}
				if (abundant[i - abNums[iAb]]) {
					nums[i] = 0;
					break;
				}
				iAb++;
			}
		}
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum += nums[i];
		}
		return sum;
	}

	private boolean isAbundant(int n) {
		return (sumOfDivisors(n) > n + n);
	}

	private int sumOfDivisors(int num) {
		int prod = 1;
		for (int i = 2; i * i <= num; ++i) {
			int p = 1;
			while (num % i == 0) {
				p = p * i + 1;
				num /= i;
			}
			prod *= p;
		}
		if (num > 1) {
			prod *= 1 + num;
		}
		return prod;
	}
}
