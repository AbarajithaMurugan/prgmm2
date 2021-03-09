package org.program;

import java.util.Iterator;

public class CapsFirstLetterString {
public static void main(String[] args) {
	String s="happy new year";
	String res=" ";
	//String op=" ";
	String[] split = s.split(" ");
	for (String string : split) {
		String case1 = string.toUpperCase();
		char c = case1.charAt(0);
	
		String substring = string.substring(1);
		String lc1= substring.toLowerCase();
		res=res+c+lc1+" ";
		
		
	}System.out.println(res);
}
}
