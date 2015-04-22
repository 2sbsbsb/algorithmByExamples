package examples.dynamicProgramming;

public class CoinChange {

	public CoinChange() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param S sorted coins in asc order
	 * @param m
	 * @param n
	 * @return
	 */
	public static int count( int S[], int m, int n )
	{
	    // table[i] will be storing the number of solutions for
	    // value i. We need n+1 rows as the table is constructed
	    // in bottom up manner using the base case (n = 0)
	    int[] table = new int[n+1];
	 
	    // Base case (If given value is 0)
	    table[0] = 1;
	 
	    // Pick all coins one by one and update the table[] values
	    // after the index greater than or equal to the value of the
	    // picked coin
	    //
	    //
	    // All Coins one by one 
	    for(int i=0; i<m; i++) {
	    	// For each coin start with the value of that coin to the required sum
	        for(int j=S[i]; j<=n; j++) {
	        	// Ex : If the coin value is 5 cents table[11] = table[11] (Previous ways) + table[11-5] (No of ways 6 can be achieved)  
	            table[j] += table[j-S[i]];
	        }
	    }
	    return table[n];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {3,5,10,25,50};
		int noOfWays = count(coins,coins.length,15);
		System.out.println(noOfWays);
	}

}
