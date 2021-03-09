package org.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateStringCharacCount {
	public static void main(String[] args) {
		String s = "abarajitha";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				char c = s.charAt(i);
				char d = s.charAt(j);
				if (c == d) {

					System.out.println(c);

				}

			}
		}

		String s1 = "abarajitha";
		char[] charArray = s1.toCharArray();
		//System.out.println(charArray);
		Set<Character> se = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			se.add(charArray[i]);

		}
		System.out.println(se);
		

	}

}
