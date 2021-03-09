package org.program;

public class ReverseString {
	public static void main(String[] args) {
		String s="abarajitha";
		String emp=" ";
		for (int i =s.length()-1; i>=0 ; i--) {
			char c = s.charAt(i);
		
			emp=emp+c;
			
		}System.out.println(emp);
		
		
		///// reverse the entire line/////
		String s1="Happy New Year";
		String empty=" ";
		String res=" ";
		String[] split = s1.split(" ");
		for (String string : split) {
			
			for (int i =string.length()-1; i>=0 ; i--) {
				
				char c1 = string.charAt(i);
				res=res+c1;
						
			}
			
		}
		empty=empty+res;
		System.out.println(empty);
	}

}
