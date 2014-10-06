/**
 * Coin sums
 * Problem 31
 * 
 * In England the currency is made up of pound, £, and pence, p, and there are
 * eight coins in general circulation:
 * 
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * 
 * It is possible to make £2 in the following way:
 * 
 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
 * 
 * How many different ways can £2 be made using any number of coins?
 */
public class sol {
	private static final int SUM = 200;
	private static final int COINS = 7;
	private static int[][] nway = new int[SUM + 1][COINS + 1];
	private static int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };

	public static void main(String[] args) {
		initialise();
		System.out.println(f(SUM, COINS));
	}

	private static void initialise() {
		for (int i = 0; i <= SUM; i++) {
			for (int j = 0; j <= COINS; j++) {
				nway[i][j] = -1;
			}
		}

		nway[0][0] = 1;
	}

	private static int f(int s, int j) {
		if (j < 0 || s < 0) {
			return 0;
		}

		if (nway[s][j] > -1) {
			return nway[s][j];
		}

		return (f(s, j - 1) + f(s - coins[j], j));
	}
}
