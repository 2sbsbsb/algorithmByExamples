package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	public static void sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */

		Arrays.sort(a, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.replaceAll(" ", "").compareTo(o2.replaceAll(" ", ""));
			}
		});
    }
	  
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] values = new String[] {"b", " a", "ab", "a c", "z ", "b"};
		System.out.println(Arrays.toString(values));
		sortIgnoringSpaces(values);
		System.out.println(Arrays.toString(values));
	}

}
