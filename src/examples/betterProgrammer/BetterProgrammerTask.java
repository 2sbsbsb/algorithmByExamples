package examples.betterProgrammer;

import java.util.ArrayList;
import java.util.List;

public class BetterProgrammerTask {

    public static int countAlmostPrimeNumbers(int from, int to) {
        /*
          A prime number is a natural number that has exactly two distinct natural number divisors,
          which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13.

          Almost prime numbers are the non-prime numbers
          which are divisible by only a single prime number.

          Please implement this method to
          return the number of almost prime numbers within the given range (inclusively).
         */
    	int sum = 0;
    	List<Integer> primes = new ArrayList<Integer>();
		for (int i = from; i <= to; i++) {
			boolean isNotPrime = isNotPrime(i);
			if (!isNotPrime) {
				primes.add(i);
			} else {
			if(isAlmostPrime(i,primes)) {
				sum+=i;
			}
			}
		}		
		return sum;		
    }
    
    /**
     * @param i
     * @param primes
     * @return
     */
    private static boolean isAlmostPrime(int i, List<Integer> primes) {
    	int count =0;
		for(Integer p : primes) {
			if(i%p==0){
				count++;
			}
		}
		return count==1;
	}

	/**
	 * @param i
	 * @return
	 */
	private static boolean isNotPrime(int i) {
		boolean result = false;		
		if(i==1) {
			return true;
		}
		if(i==2 || i==3) {
			return false;
		}
		for(int j=2; j<=i; j++) {
			if(i!=j && i%j==0) {
				result = true;
				break;
			}
		}
		return result;
	}
 


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countAlmostPrimeNumbers(1,10));	
	}
}
