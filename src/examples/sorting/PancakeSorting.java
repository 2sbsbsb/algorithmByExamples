package examples.sorting;

import java.util.Arrays;

public class PancakeSorting {

	public PancakeSorting() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param array
	 */
	public static void pancakeSort(int[] array) {
		int size = array.length;
		// Start from the end and iterate to the beginning
		for(int i=size-1; i>=0; i--) {
			// Find the max index 
			int maxIndex = maxIndex(array,i);
			// If the max element is already present at the end of iterator do not do anything 
			if(maxIndex!=i) {
				// Otherwise flip the array from the beginning to the maxIndex 
				flip(array,maxIndex);
				// And flip the array from the beginning to the end of the iterator
				flip(array,i);
			}
		}
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
		int[] array = {1,5,-6,2,-4,3,7};
		pancakeSort(array);
		System.out.println(Arrays.toString(array));
	}

}
