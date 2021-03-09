package org.program;

public class PallindromeString {
public static void main(String[] args) {
	String s="abbara";
String rem="";
	for (int i = s.length()-1; i>=0; i--) {
		char c = s.charAt(i);
		rem=rem+c;
	}
		if (s.equals(rem)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
	}
	
	
	
}

