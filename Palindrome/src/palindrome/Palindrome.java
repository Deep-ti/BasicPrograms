package palindrome;

public class Palindrome {
	public boolean isPalindrome(String original) {
		boolean isPalindrome = false;
		String reverse = "";
		for(int i = (original.length()-1); i >= 0;i--) {
			reverse =reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}
	
}
