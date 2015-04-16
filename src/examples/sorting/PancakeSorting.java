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
		for(int i=size-1; i>=0; i--) {
			int maxIndex = maxIndex(array,i);
			if(maxIndex!=i) {
				flip(array,maxIndex);
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
