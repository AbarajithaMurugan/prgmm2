package org.program;

import org.apache.maven.model.MailingList;

public class Program1 {
	public static void main(String[] args) {
		String s = "this is the story about the boy in london";
		String s1 = "the";
		int count = 0;
		int length = s.length();
		String[] split = s.split(" ");
		for (String string : split) {
		//	String substring = string.substring(0);
			//System.out.println(substring);

			if (string.equals(s1)) {
				count = count + 1;

			}

		}

		System.out.println(count);

	}
}