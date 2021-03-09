package org.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveStringWords {
	public static void main(String[] args) {
		
//		String string = "Big black bug bit a big black dog on his big black nose";
//		int count;
//
//		// Converts the string into lowercase
//		string = string.toLowerCase();
//
//		// Split the string into words using built-in function
//		String words[] = string.split(" ");
//
//		System.out.println("Duplicate words in a given string : ");
//		for (int i = 0; i < words.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < words.length; j++) {
//				if (words[i].equals(words[j])) {
//					count++;
//					// Set words[j] to 0 to avoid printing visited word
//					words[j] = "0";
//				}
//			}
//
//			// Displays the duplicate word if count is greater than 1
//			if (count > 1 && words[i] != "0")
//				System.out.println(words[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		String s = "hie hello hie hello";
		String s1 = s;
		String[] split = s.split(" ");
		for (int i = 0; i < s.length(); i++) {
			String substring = s.substring(i);
			System.out.println(substring);
		}

		Set<String> si = new LinkedHashSet<String>();
		si.add(s);
		si.add(s1);
		System.out.println(si);

		for (String string : si) {
			for (int i = 0; i < split.length; i++) {

			}

			System.out.println(string);

		}

	}
}