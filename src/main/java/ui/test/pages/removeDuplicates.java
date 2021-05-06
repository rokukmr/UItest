package ui.test.pages;

import java.util.LinkedHashSet;

public class removeDuplicates {

	public static void main(String[] args) {
		String [] arr = {"r","r","r","o","o","h"};
		LinkedHashSet <String> removed = new LinkedHashSet<String>();
		for (int i=0; i<= arr.length-1; i++) {
			removed.add(arr[i]);	
		}
		System.out.print(removed);

	}

}
