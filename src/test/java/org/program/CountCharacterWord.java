package org.program;

import java.util.Iterator;

public class CountCharacterWord {
	public static void main(String[] args) {
		String s="abarajitha";
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			count++;//count=count+1;
		}System.out.println(count);
		///// count word//////
		String st="happy new year";
		int countt=0;
		String[] split = st.split(" ");
	for (String string : split) {
		
		//String word = string.substring(0);
		countt++;
	//	System.out.println(word);
		
	}System.out.println(countt);
	}
	

}
