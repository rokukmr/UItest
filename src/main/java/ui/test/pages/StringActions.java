package ui.test.pages;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringActions {

	public void reverseSubStrings(String s) {
		System.out.println("");
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String str = st[i];
			for (int j = str.length() - 1; j >= 0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	public void reverseString(String s) {
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
		
	}
	
	public void countOfOccurence(String a) {
		Map	count = new LinkedHashMap< Character, Integer>();
		for (char ch : a.toCharArray()) {
			if(count.containsKey(ch)) {
				count.put(ch, (Integer)count.get(ch) + 1);
			}
			else {
				count.put(ch, 1);
			}
		}
		System.out.println(count);
	}
	
	public void checkPalindrome(String s) {
		String str = "";
		for(int i=s.length()-1; i>=0; i--) {
			str = str + s.charAt(i);
		}
		System.out.println(str);
		if(s.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
	
	public void captilize(String s) {
		String [] cap = s.split(" ");
		for(String st : cap) {
			String firstString = st.substring(0,1);
			String restPart = st.substring(1);
			System.out.print(firstString.toUpperCase() + restPart + " ");
		}
	}
	
	public void rotateArray(int arr[]) {
		
	}

	public static void main(String[] args) {
		String arr = "Rohit";
		String s = "nitin rohit";
		StringActions str = new StringActions();
		str.reverseString(s);
		str.reverseSubStrings(s);
		str.countOfOccurence(arr);
		str.checkPalindrome(s);
		str.captilize(s);

	}
}
