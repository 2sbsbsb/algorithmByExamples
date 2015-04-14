package examples.Kernighan;

public class SetBitCounter {

	public SetBitCounter() {
		//
	}

	/**
	 * 
	 * @param n
	 * @return count of set bits
	 * 
	 *         <pre>
	 * Explanation as copied from http://stackoverflow.com/questions/12383002/please-explain-the-logic-behind-kernighans-bit-counting-algorithm
	 * 
	 * Stepping through the code in a debugger helped me.
	 * 
	 * 		If you start with
	 * 
	 * 		n = 1010101 & n-1=1010100 => 1010100
	 * 		n = 1010100 & n-1=1010011 => 1010000
	 * 		n = 1010000 & n-1=1001111 => 1000000
	 * 		n = 1000000 & n-1=0111111 => 0000000
	 * 		So this iterates 4 times. 
	 * 		Each iteration decrements the value in such a way that the least significant bit that is set to 1 disappears.
	 * 		Decrementing by one flips the lowest bit and every bit up to the first one. e.g. if you have 1000....0000 -1 = 0111....1111 
	 * 		not matter how many bits it has to flip and it stops there leaving any other bits set untouched. When you and this with n the 
	 * 		lowest bit set and only the lowest bit becomes 0
	 * </pre>
	 * 
	 */
	public static int countSetBit(int n) {
		int counter = 0;
		while (n != 0) {
			n &= (n - 1);
			counter++;
		}
		return counter;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length>0) {
			int n = Integer.parseInt(args[0]);
			System.out.println("The number of set bits in " + n + " is " + countSetBit(n));
		} else {
			System.out.println("Please try entering the number");
		}
	}

}
