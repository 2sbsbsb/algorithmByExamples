package examples.betterProgrammer;


public class BetterProgrammerTask {

	public static int getSumOfNumbers(String s) {
		/*
		 * Please implement this method to return the sum of all integers found
		 * in the parameter String. You can assume that integers are separated
		 * from other parts with one or more spaces (' ' symbol). For example,
		 * s="12 some text 3  7", result: 22 (12+3+7=22)
		 */
		int sum = 0;
		String[] strArrays = s.split(" ");
		for (String str : strArrays) {
			sum += Integer.parseInt(str);
		}
		return sum;

	}

}
