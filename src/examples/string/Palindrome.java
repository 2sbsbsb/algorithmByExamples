package examples.string;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <pre>
	 *     PALINDROME are words which are read same from both sides (ignoring space, case)
	 * </pre>
	 * @return
	 */
	public static boolean isPalindrome(String var) {
	 // CASE and space or word dividers are not important 
	 String varR = var.replaceAll(" ", "").toLowerCase();	 
	 int size = varR.length();
	 int x =0;
	 int y = size-1;
	 while(x<y) {
		 if(varR.charAt(x) != varR.charAt(y)) {
			 return false; 
		 }
		 x++;
		 y--;
	 }		
	 return true;	 
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		System.out.println(isPalindrome("Anat  ana"));
	}

}
