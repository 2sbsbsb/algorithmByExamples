package examples.leetcode;

public class Solution {
	
	/**
	 * Adding two numbers and returning numbers in String format 
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
    public String multiply(String num1, String num2) {
        String result = String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2));
        if(result.endsWith(".0")) {
        	result = result.substring(0, result.lastIndexOf(".0"));
        }
        return result;
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution(); 
    	System.out.println(solution.multiply("2.0","3.0"));
    }
}