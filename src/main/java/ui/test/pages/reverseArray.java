package ui.test.pages;

import java.util.ArrayList;

public class reverseArray {
	public void reverseArray() {
		String [] arr = {"r","o","h","i","t"};
		ArrayList <String> al = new ArrayList<String>();
		for(int i=arr.length-1; i>=0; i--) {
			al.add(arr[i]);
		}
		System.out.print(al);
		
	}

	public static void main(String[] args) {
		reverseArray rr = new reverseArray();
		rr.reverseArray();

	}

}
