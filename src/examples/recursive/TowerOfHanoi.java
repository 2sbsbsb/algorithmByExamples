package examples.recursive;

/**
 * @author santoshb
 * 
 * Tower of Hanoi as per wiki 
 * http://en.wikipedia.org/wiki/Tower_of_Hanoi
 */
public class TowerOfHanoi {

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
			System.out.println("Moved from " + source + " to " + destination);
		} else if (n > 1) {
			toh(n - 1, source, destination, aux);
			toh(1, source, aux, destination);
			toh(n - 1, aux, source, destination);
		}
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			int n = Integer.parseInt(args[0]);
			toh(n, "A", "B", "C");
		} else {
			System.out.println("Enter the no of towers");
		}
	}

}
