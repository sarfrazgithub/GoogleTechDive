package com.foundationsofprogramming.exercises;

import java.util.Arrays;
import java.util.List;



public class StringSubSequence {


public static void main(String[] args) {
	
	String S = "abppplee";
	String D[] = {"able", "ale", "apple", "bale", "kangaroo"};
	
	System.out.println(longestString(S,D));
	
}

	private static String longestString(String s, String[] d) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = (List<String>) Arrays.asList(d);
		listOfStrings.sort((s1, s2) -> s2.length() - s1.length());

		for (String s1 : listOfStrings) {
			
			if (s1.length() <= s.length()) {
				int i = 0, j = 0;
				for (; i < s1.length() && j < s.length();) {

					
					if (s1.charAt(i) == s.charAt(j)) {
						i++;
						j++;
					} else {
						j++;
					}

				}
				if (i == s1.length()) {
					return s1;
				}
			}
		}

		return "";
	}
}
