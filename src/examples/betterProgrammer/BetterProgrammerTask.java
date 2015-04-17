package examples.betterProgrammer;

public class BetterProgrammerTask {

	/**
	 * @param a
	 * @return
	 */
	public static int sumOfTwoLargestElements(int[] a) {
		/*
		 * Please implement this method to return the sum of the two largest
		 * numbers in a given array.
		 */
		int largest = 0;
		int largest2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= largest) {
				largest2 = largest;
				largest = a[i];
			} 
		}

		return largest + largest2;
	}

	
	public static void main(String[] args) {		
		int[] a = {1,5,6,7,8,8,11};		
		System.out.println(sumOfTwoLargestElements(a));
	}
}
