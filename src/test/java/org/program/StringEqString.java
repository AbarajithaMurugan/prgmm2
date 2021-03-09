package org.program;

public class StringEqString {
	public static void main(String[] args) {
		String s1="cAllFor theDay";
		String s2="CALL FortheDay";
		String rem=" ";
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("S1 equals S2");
		}
		
		if (s1.equals(s2)) {
			
			System.out.println("equals");
		} else {

			System.out.println("not equals");
		}
		String[] split1 = s1.split(" ");
		for (String string : split1) {
			String substring = string.substring(0);
			System.out.println(substring);
			rem=rem+substring;
			System.out.println(rem);
		}	
		
		
	}

}
