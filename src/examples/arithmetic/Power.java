package examples.arithmetic;

public class Power {

	public Power() {
		// TODO Auto-generated constructor stub
	}

	/**
	 */
	static int power(int x, int n) {
		if (n == 1) {
			return x;
		} else if (n % 2 == 0) {
			int b = power(x,n/2);
			return b*b;
		} else {
			return x * power(x,n-1);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		if(args.length>1) {
			int x = Integer.parseInt(args[0]);
			int n = Integer.parseInt(args[1]);
			System.out.println(x + " to power " + n + " is " + power(x, n));
		} else {
			System.out.println("Please try running program with two integers x and n to evaluate (x to power n)");
		}
	}
	
}
