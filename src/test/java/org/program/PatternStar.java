package org.program;

public class PatternStar {
	public static void main(String[] args) {
		//////// right angle/////
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j<=i; j++) {
				
				System.out.print("*");
		
		}
			

			System.out.println(" ");
		}
		
///////////    mirror img of right angle////////
//		for (int i = 5; i >=0; i--) {
//			for (int j = 1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			
//		}
		







		
		
	////////// left right angle///////
//		for (int i = 1; i <6; i++) {
//			for (int j = 0; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
		
		
		for (int i = 6; i > 1; i--) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}

}
