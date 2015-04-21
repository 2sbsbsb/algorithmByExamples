package examples.betterProgrammer;

import java.util.*;

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
		int lastIndex = a.length - 1;
		for (int i = lastIndex; i > 0; i--) {
			int maxIndex = maxIndex(a, i);
			// if the maxIndex is already sorted the do not sorts
			if (maxIndex != i) {
				if (maxIndex != 0) {
					flip(a, maxIndex);
					results.add(maxIndex + 1);
				}
				flip(a, i);
				results.add(i+1);
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
	 * @param a
	 * @param index
	 * @return
	 */
	public static int maxIndex(int[] a, int index) {
		int max = 0;
		for (int i = 0; i <= index; i++) {
			if (a[i] > a[max]) {
				max = i;
			}
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 12, 13, 11, 14 };
		List<Integer> results = getReversalsToSort(a);
		for (Integer r : results) {
			System.out.println(r);
		}
	}

}
