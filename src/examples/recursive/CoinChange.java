package examples.recursive;

public class CoinChange {

	public CoinChange() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param amount
	 * @param coins
	 * @return
	 */
	int findCombinationsCount(int amount, int coins[]) {
		return findCombinationsCount(amount, coins, 0);
	}

	/**
	 * @param amount
	 * @param coins
	 * @param checkFromIndex
	 * @return
	 */
	int findCombinationsCount(int amount, int coins[], int checkFromIndex) {
		if (amount == 0)
			return 1;
		else if (amount < 0 || coins.length == checkFromIndex)
			return 0;
		else {
			int withFirstCoin = findCombinationsCount(amount
					- coins[checkFromIndex], coins, checkFromIndex);
			int withoutFirstCoin = findCombinationsCount(amount, coins,
					checkFromIndex + 1);
			return withFirstCoin + withoutFirstCoin;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
