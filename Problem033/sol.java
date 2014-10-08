/**
 * Digit canceling fractions
 * Problem 33
 * 
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician
 * in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which
 * is correct, is obtained by cancelling the 9s.
 * 
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 * 
 * There are exactly four non-trivial examples of this type of fraction, less
 * than one in value, and containing two digits in the numerator and
 * denominator.
 * 
 * If the product of these four fractions is given in its lowest common terms,
 * find the value of the denominator.
 */
public class sol {
	public static void main(String[] args) {
		int numerator = 1, denominator = 1;
		double result = 0.0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = j + 1; k < 10; k++) {
					if ((10 * j + i) * k == (10 * i + k) * j) {
						numerator *= (j * 10 + i);
						denominator *= (i * 10 + k);
					}
				}
			}
		}
		
		result = (double) denominator / numerator;
		System.out.println(result);
	}
}
