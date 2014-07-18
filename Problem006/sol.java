/**
 * Sum square difference
 * Problem 6
 * 
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... +
 * 102 = 385 The square of the sum of the first ten natural numbers is, (1 + 2 +
 * ... + 10)2 = 552 = 3025 Hence the difference between the sum of the squares
 * of the first ten natural numbers and the square of the sum is 3025 - 385 =
 * 2640. Find the difference between the sum of the squares of the first one
 * hundred natural numbers and the square of the sum.
 */
public class sol {
	public static void main(String[] args) {
		int sumSquare = (100 * 101 * 201) / 6;
		int sum = 0, squareSum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum += i;
			squareSum = sum * sum;
		}
		
		System.out.println((squareSum - sumSquare));
	}
}
