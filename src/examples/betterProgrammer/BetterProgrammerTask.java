package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	public static double getProbability(int Y, int X) {
        /*
          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
         */		   	
	  double sum = 0;
	  for(int i=X;i<=Y;i++) {
		 double value = nCr(Y,i) * Math.pow((1/6d),i) * Math.pow(5/6d, Y-i);
		sum+= (value);
	  }
	  return sum;		   
    }

	

	  /**
	   * @param n
	   * @param r
	   * @return
	   */
	  public static double nCr(int n, int r) {
		  double num = 1;
		  for(int i=n; i>(n-r); i--) {
			  num*=i;
		  }
		  double den = 1;
		  for(int i=r; i>1; i--) {
			  den*=i;
		  }
		  return num/(double)den;		  
	  }
	  
	  public static void main(String[] args) {
		  System.out.println(getProbability(100,20));
	  }
	
	  
}
