package examples.dynamicProgramming;

import java.util.Arrays;

public class CoinChange {

	public CoinChange() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param S
	 *            Coins in ASCENDING order
	 * @param n
	 *            Required Sum
	 * @return
	 */
	public static int count(int[] S, int n) {
		// Table[i] will be storing the number of solutions for
		// value i. We need n+1 rows as the table is constructed
		// in bottom up manner using the base case (n = 0)
		int[] table = new int[n + 1];

		// Base case (If given value is 0). This is important
		table[0] = 1;

		// Pick all coins one by one and update the table[] values
		// after the index greater than or equal to the value of the
		// picked coin
		//
		//
		// All Coins one by one
		for (int i = 0; i < S.length; i++) {
			// For each coin start with the value of that coin to the required
			// sum (Yes coins are sorted)
			for (int j = S[i]; j <= n; j++) {
				// Ex : Suppose for a given i, S[i] = 5 cents, then for any any
				// j (Ex:11) table[11] =
				// table[11] (Previous ways) + table[11-5] (No of ways 6 can be
				// achieved)
				table[j] += table[j - S[i]];
				System.out.println("i=" + i + " j=" + j + " "
						+ Arrays.toString(table));
			}
		}
		return table[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 5, 10, 25, 50 };
		int noOfWays = count(coins, 10);
		System.out.println(noOfWays);
	}

}
