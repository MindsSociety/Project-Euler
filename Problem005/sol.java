/**
 * Smallest multiple
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 */
public class sol {
	public static void main(String[] args) {
		boolean found = false;
		int result = 1;

		while (!found) {
			result++;

			if (result % 11 == 0 && result % 12 == 0 && result % 13 == 0
					&& result % 14 == 0 && result % 15 == 0 && result % 16 == 0
					&& result % 17 == 0 && result % 18 == 0 && result % 19 == 0
					&& result % 20 == 0) {
				System.out.println(result);
				found = true;
			}
		}
	}
}
