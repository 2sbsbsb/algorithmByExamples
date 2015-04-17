package examples.betterProgrammer;

import java.util.Arrays;

public class BetterProgrammerTask {

	public static int getClosestToZero(int[] a) {
		/*
		 * Please implement this method to return the number in the array that
		 * is closest to zero. If there are two equally close to zero elements
		 * like 2 and -2 - consider the positive element to be "closer" to zero.
		 */
		int closet = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			closet = (Math.abs(a[i]) < Math.abs(closet)) ? a[i] : (Math.abs(a[i]) == Math.abs(closet) && a[i]>0 ? a[i] : closet);					
		}
		return closet;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 12, 13, 11, 14, 6,20,10,-5 };
		System.out.println(Arrays.toString(a));	
		System.out.println(getClosestToZero(a));
	}

}
