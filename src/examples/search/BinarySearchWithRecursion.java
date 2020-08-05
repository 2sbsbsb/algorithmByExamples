package examples.search;

/**
 *  // Assumption - Sorted array 
 *  function search (array, value, low, high) {
 *  	mid = low + high / 2 
 *  	if mid is equal to value return mid 
 *  	if mid is less than value search ( array, value, low, mid-1) 
 *  	if mid is more than value search ( array, value, mid + 1, high) 
 *  }
 */
public class BinarySearchWithRecursion {
	
	/**
	 * @return
	 */
	public static int search(int[] array, int value, int low, int high) {
		if (low > high) {
			return -1; 
		}
		int mid = (low + high)/2; 
		if(array[mid] == value) {
			return mid; 
		} else if (value < array[mid]) {
			return search(array, value, low, mid-1);
		} else if (value > array[mid]) {
			return search(array, value, mid+1, high);
		}
		return -1;
	}
	
	
	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// Ex 
		int[] array = {10,20,30,40,50,60};
		int result = search(array,30,0,array.length-1);
		System.out.println(result);
	}

}