/**
 * Pandigital products
 * Problem 32
 * 
 * We shall say that an n-digit number is pandigital if it makes use of all the
 * digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1
 * through 5 pandigital.
 * 
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing
 * multiplicand, multiplier, and product is 1 through 9 pandigital.
 * 
 * Find the sum of all products whose multiplicand/multiplier/product identity
 * can be written as a 1 through 9 pandigital. HINT: Some products can be
 * obtained in more than one way so be sure to only include it once in your sum.
 */
public class sol {
	public static void main(String[] args) {
		int[] table = new int[10000];
		double l1 = Math.log(1000 * Math.sqrt(10));
		double l2 = Math.log(10000);

		for (int A = 0; A < 9999; A++) {
			int max = (int) Math.exp(l2 - Math.log(A));
			
			for (int B = (int) Math.exp(l1 - Math.log(A)); B < max; B++) {
				String all = "" + A + B + (A * B);
				
				if (all.length() == 9) {
					char c = '1';
					
					for (; c <= '9'; c++) {
						if (all.indexOf(c) == -1) {
							break;
						}
					}
					
					if (c > '9') {
						table[A * B] = A * B;
					}
				}
			}
		}

		int result = 0;
		
		for (int i = 0; i < table.length; i++) {
			result += table[i];
		}

		System.out.println(result);
	}
}
