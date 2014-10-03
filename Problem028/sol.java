/**
 * Number spiral diagonals
 * Problem 28
 * 
 * Starting with the number 1 and moving to the right in a clockwise direction a
 * 5 by 5 spiral is formed as follows:
 * 
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
 * formed in the same way?
 */
public class sol {
	public static void main(String[] args) {
		int result = 0, j = 2;
		
		for (int i = 1; i <= 1001 * 1001; result += i, i += j) {
			if ((j + 1) * (j + 1) == i) {
				j += 2;
			}
		}

		System.out.println(result);
	}
}
