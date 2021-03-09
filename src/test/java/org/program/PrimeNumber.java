package org.program;

public class PrimeNumber {
	public static void main(String[] args) {
	int flag=0;
		int num=20;
//		for (int i = 2; i<=num/2; i++) {
//			if (num%i==0) {
//				flag=1;
//				System.out.println("not prime");
//				break;
//			} 
//			
//			
//			
//			
//		}
//		if (flag==0) {
//			System.out.println(" prime");
//		} 
		/////// prime n numbers////
		
		

		for (int n = 1; n <=33; n++) {
		for (int i = 2; i < n; i++) {
			
			if (n%2==0) {
				//System.out.println("not prime"+"\t"+n);
				break;
			}
			if(n%2==1) {
				System.out.println(n);
				break;
			}
			
		}
				
		
		
	}
		
		}

}
