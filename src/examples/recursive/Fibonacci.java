package examples.recursive;

public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param n
	 * @return
	 */
	public static int fib(int n) {
		if(n==0){
			return 0; 
		} else if(n == 1) {
			return 1;
		} else {
			return fib (n-1) + fib(n-2);
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
		System.out.println(fib(6));
	}

}
