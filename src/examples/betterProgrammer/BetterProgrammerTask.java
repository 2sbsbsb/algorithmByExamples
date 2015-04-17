package examples.betterProgrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetterProgrammerTask {

	public static List<Integer> getReversalsToSort(int[] a) {
		/*
		 * You need to sort an array of integers by repeatedly reversing the
		 * order of the first several elements of it.
		 * 
		 * For example, to sort [12,13,11,14], you need to reverse the order of
		 * the first two (2) elements and get [13,12,11,14] and then reverse the
		 * order of the first three (3) elements and get [11,12,13,14]
		 * 
		 * The method should return the shortest(!) possible list of integers
		 * corresponding to the required reversals. For the previous example,
		 * given an array [12,13,11,14] the method should return a list with
		 * Integers 2 and 3.
		 */
		List<Integer> results = new ArrayList<Integer>();
		int size = a.length;
		// Start from the end and iterate to the beginning
		for (int i = size - 1; i >= 0; i--) {
			// Find the max index
			int maxIndex = maxIndex(a, i);
			// If the max element is already present at the end of iterator do
			// not do anything						
			if (maxIndex != i) {				
				// Otherwise flip the array from the beginning to the maxIndex
				if (maxIndex != 0) {
					flip(a, maxIndex);
					System.out.println(Arrays.toString(a));
					results.add(maxIndex + 1);
				}
				// And flip the array from the beginning to the end of the
				// iterator
				flip(a, i);
				System.out.println(Arrays.toString(a));
				results.add(i + 1);
			}
		}
		return results;
	}

	/**
	 * Flip this array from index 0 to endIndex
	 * 
	 * @param array
	 * @param maxIndex
	 */
	public static void flip(int[] array, int endIndex) {
		int startIndex = 0;
		while (startIndex < endIndex) {
			int temp = array[endIndex];
			array[endIndex] = array[startIndex];
			array[startIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}

	/**
	 * Find the max index between i=0 to endIndex
	 * 
	 * @param array
	 * @return
	 */
	public static int maxIndex(int[] array, int endIndex) {
		int maxIndex = 0;
		for (int i = 0; i <= endIndex; i++) {
			if (array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 12, 13, 11, 14, 6 };
		System.out.println(Arrays.toString(a));
		List<Integer> results = getReversalsToSort(a);
		for (int r : results) {
			System.out.println(r);
		}
		System.out.println(Arrays.toString(a));
	}

}
