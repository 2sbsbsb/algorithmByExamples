package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	  /**
	   * @param a
	   * @return
	   */
	  public static int[] retainPositiveNumbers(int[] a) {
	        /*
	          Please implement this method to
	          return a new array with only positive numbers from the given array.
	          The elements in the resulting array shall be sorted in the ascending order.
	         */
		  List<Integer> results = new ArrayList<Integer>();
		  for(int aa : a) {
			  if(aa>0) {
				  results.add(aa);
			  }
		  }
		  Collections.sort(results);
		  int[] values = new int[results.size()];
		  for(int i=0;i<results.size();i++) {
			  values[i] = results.get(i);
		  }
		  return values;
	   }
	  
	  
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(retainPositiveNumbers(new int[]{1,2,3,5,6,-1,-10,-2, 2})));
	}

}
