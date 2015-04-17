package examples.betterProgrammer;


public class BetterProgrammerTask {

	 	/**
		 * @param a
		 * @return
		 */
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

}
