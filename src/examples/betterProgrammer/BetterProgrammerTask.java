package examples.betterProgrammer;

public class BetterProgrammerTask {

	public static int getSumOfNumbers(String s) {
		/*
		 * Please implement this method to return the sum of all integers found
		 * in the parameter String. You can assume that integers are separated
		 * from other parts with one or more spaces (' ' symbol). For example,
		 * s="12 some text 3  7", result: 22 (12+3+7=22)
		 */
		String[] values = s.split(" ");
		int sum = 0;
		for(String value : values) {
			int val = 0;
			try {
				val = Integer.parseInt(value);
			} catch(Exception ex) {
				
			}
			sum+=val;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getSumOfNumbers("12 some text 3  7"));
	}

}
