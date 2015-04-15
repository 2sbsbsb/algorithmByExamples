package examples.recursive;

/**
 * @author santoshb
 * 
 *         Tower of Hanoi as per wiki
 *         http://en.wikipedia.org/wiki/Tower_of_Hanoi
 */
public class TowerOfHanoi {

	static int moveCount;

	public TowerOfHanoi() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param results
	 * @param n
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void toh(int n, String source, String aux, String destination) {
		if (n == 1) {
			System.out.println("Moved from " + source + " to " + destination
					+ ". Total move count " + (++moveCount));
		} else if (n > 1) {
			toh(n - 1, source, destination, aux);
			toh(1, source, aux, destination);
			toh(n - 1, aux, source, destination);
		}
	}

	/**
	 * Run 1st with 2,5,10,20,30. Imagine how much it will take to run with 100 
	 * Verify that it is 2^n -1 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			int n = Integer.parseInt(args[0]);
			toh(n, "A", "B", "C");
		} else {
			System.out.println("Enter the no of towers");
		}
	}

}
