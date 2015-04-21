package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	public static List<Integer> getPerfectNumbers(int from, int to) {
		/*
		 * Please implement this method to return a list of all perect numbers
		 * in the given range inclusively. A perfect number is defined as a
		 * positive integer which is the sum of its positive divisors not
		 * including the number itself. For example: 6 is a perfect number
		 * because 6 = 1 + 2 + 3 (1, 2, 3 are divisors of 6) 28 is also a
		 * perfect number: 28 = 1 + 2 + 4 + 7 + 14
		 */
		List<Integer> results = new ArrayList<Integer>();
		for (int i = from; i <= to; i++) {
			if (perfectNumber(i)) {
				results.add(i);
			}
		}
		return results;
	}
	
	/**
	 * @param i
	 * @return
	 */
	private static boolean perfectNumber(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}

	public static void main(String[] args) {
		List<Integer> results = getPerfectNumbers(1, 50);
		for(Integer result : results) {
			System.out.println(result);
		}
	}

}
