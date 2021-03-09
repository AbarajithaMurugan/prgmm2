package org.program;

public class PrintOnlyNumber {
	public static void main(String[] args) {
		String s="hie2020";
		int count=0;
		
		for (int i = 0; i <=s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
			if ((c>='0')&(c<='9')) {
				count++;
				
				
			}
		}System.out.println(count);
	}

}
