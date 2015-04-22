package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	public static String reverseWords(String s) {
		/*
		 * Assume that the parameter String can only contain spaces and
		 * alphanumeric characters. Please implement this method to reverse each
		 * word in the original String while maintaining the word order. For
		 * example: parameter: "Hello world", result: "olleH dlrow"
		 */
		StringBuilder sb = new StringBuilder();
		if (s != null) {
			String[] values = s.split(" ");
			for(String value : values) {
				char[] chars = value.toCharArray();
				for(int i=chars.length-1;i>=0;i--) {
					sb.append(chars[i]);
				}
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverseWords("Hello World"));
	}

}
