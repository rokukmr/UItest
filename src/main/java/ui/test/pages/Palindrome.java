package ui.test.pages;

public class Palindrome {
	String reverse = "";

	public void checkPalindrome(String name) {
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(name)) {
			System.out.print("Number is Palindrome");
		} else {
			System.out.print("Number is not Palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome check = new Palindrome();
		check.checkPalindrome("qqqqqqqqqqwqqqqqqqqqq");

	}

}
