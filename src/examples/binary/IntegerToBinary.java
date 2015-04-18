package examples.binary;

public class IntegerToBinary {

	public IntegerToBinary() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param n
	 * @return
	 */
	public static String toBinary(int n) {
		StringBuilder binary = new StringBuilder();
		while (n > 0) {
			if ((n & 1) == 1) {
				binary.append(1);
			} else
				binary.append(0);
			n >>= 1;
		}
		return binary.reverse().toString();
	}
	
	/**
	 * Using Java standard API
	 * @param n
	 * @return
	 */
	public static String toBinaryUsingApi(int n) {
		return Integer.toBinaryString(n);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value = 17;
		System.out.println(toBinary(value));
		// Using 
		System.out.println(toBinaryUsingApi(value));
	}

}
