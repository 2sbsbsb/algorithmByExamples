package examples.search;
/**
*  // Assumption - Sorted array 
*  function indexOfFirstOccurance (array, value, low, high) {
*  	mid = low + high / 2 
*  	1. if mid is equal to value Then there can be two case 
*  		a. if mid is 0 or array[mid-1] is not equal to array[mid] return mid 
*  		b. array[mid] == array[mid-1] then return search (array, value, low, mid-1) 
*  	2. if mid is less than value search ( array, value, low, mid-1) 
*  	3. if mid is more than value search ( array, value, mid + 1, high) 
*  }
*/
public class IndexOfFirstOccurance {
	
	/**
	 * @return
	 */
	public static int indexOfFirstOccurance(int[] array, int value, int low, int high) {
		if (low > high) {
			return -1; 
		}
		int mid = (low + high)/2; 
		if (value < array[mid]) {
			return indexOfFirstOccurance(array, value, low, mid-1);
		} else if (value > array[mid]) {
			return indexOfFirstOccurance(array, value, mid+1, high);
		} else {
			if(mid ==0 || array[mid-1] != array[mid]) {
				return mid; 
			} else {
				return indexOfFirstOccurance(array,value,low,mid-1);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 20, 30, 30, 30, 40, 40, 40, 40, 40, 50, 60};
		int result = indexOfFirstOccurance(array,60,0,array.length-1);
		System.out.println(result);
	}

}
