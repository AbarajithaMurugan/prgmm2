package org.program;

public class VowelsCount {
	public static void main(String[] args) {
		String s="happy new year";
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			System.out.println(c);
			
		}
			
		}System.out.println(count);
		/////// consonants count value////////
		String s1="Happy New Year";
		int count1=0;
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			if ((c1>97)&(c1<122)) {
				count1++;
				System.out.println(c1);
				
			}
			
		}System.out.println(count1);
		
	}

}
