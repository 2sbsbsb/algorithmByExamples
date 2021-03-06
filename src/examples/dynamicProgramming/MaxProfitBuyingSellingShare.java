package examples.dynamicProgramming;

/**
 * <pre>
 * Maximum profit by buying and selling a share at most twice
 * In a daily share trading, a buyer buys shares in the morning and sells it on same day. 
 * If the trader is allowed to make at most 2 transactions in a day, where as second transaction can only start after first one is complete (Sell->buy->sell->buy). 
 * Given stock prices throughout day, find out maximum profit that a share trader could have made.
 * 
 * Examples:
 * 
 * Input:   price[] = {10, 22, 5, 75, 65, 80}
 * Output:  87
 * Trader earns 87 as sum of 12 and 75
 * Buy at price 10, sell at 22, buy at 5 and sell at 80
 * 
 * Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
 * Output:  100
 * Trader earns 100 as sum of 28 and 72
 * Buy at price 2, sell at 30, buy at 8 and sell at 80
 * 
 * Input:   price[] = {100, 30, 15, 10, 8, 25, 80};
 * Output:  72
 * Buy at price 8 and sell at 80.
 * 
 * Input:   price[] = {90, 80, 70, 60, 50}
 * Output:  0
 * Not possible to earn.
 * 
 * </pre>
 * 
 * @author SantoshB
 */
public class MaxProfitBuyingSellingShare {

	public MaxProfitBuyingSellingShare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param prices
	 * @return
	 */
	public static int profit(int[] prices) {
		//
		int maxProfit = 0;
		for (int i = prices.length - 1; i >= 0; i--) {
			int max1 = maxProfit(prices, 0, i);
			for (int j = prices.length - 1; j > i; j--) {
				int max2 = maxProfit(prices, i + 1, j);
				maxProfit = Math.max(maxProfit, max1 + max2);
			}
		}
		return maxProfit;
	}

	/**
	 * @param prices
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int maxProfit(int[] prices, int startIndex, int endIndex) {
		int maxProfit = 0;
		int sellPrice = prices[endIndex];
		for (int i = endIndex; i >= Math.max(0, startIndex); i--) {
			maxProfit = Math.max(maxProfit, sellPrice - prices[i]);
		}
		return maxProfit;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] prices = { 2, 30, 15, 10, 8, 25, 80 };
		System.out.println(profit(prices));
	}

}
