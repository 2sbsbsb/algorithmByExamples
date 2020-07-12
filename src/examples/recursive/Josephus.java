package examples.recursive;

/**
 * N soldiers, 
 * 1st soldier is at 0th position and last soldiers is at n-1th position 
 * Kill kth person starting from the 1st position and handover the sword to the next soldier
 *  
 * Who is the surviver ?  
 *
 */
public class Josephus {

	
	/**
	 * @param n
	 * @param k
	 * @return
	 */
	public static int compute(int n, int k) {
		
		if (n==1) {
			return 0; 
		}
		
		return (compute(n-1,k) + k)%n ;		
	}
	
	public static void main(String[] args) {
		int result = compute(41,2);
		System.out.println(result);
	}
	
}
