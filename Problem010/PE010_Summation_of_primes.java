import java.math.BigInteger;

/**
 * Summation of primes
 * Problem 10
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the
 * primes below two million.
 */
public class PE010_Summation_of_primes {
	public static void main(String[] args) {
		BigInteger result = BigInteger.ZERO;
		
		for (BigInteger num = BigInteger.valueOf(2); num.compareTo(BigInteger
				.valueOf(2000000)) < 0; num = num.nextProbablePrime()) {
			result = result.add(num);
		}

		System.out.println(result);
	}
}
