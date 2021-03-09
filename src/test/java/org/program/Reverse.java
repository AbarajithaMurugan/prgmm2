package org.program;

public class Reverse {
	public static void main(String[] args) {
		int num=123456;
		int rem=0;
		int res=0;
		while (num>0) {
			
		
		rem=num%10;
		res=(res*10)+rem;
		num=num/10;
		
		
	}System.out.println(res);
	//////pallindrome/////
	int num1=121;
	int rev=num1;
	int rem1=0;
	int res1=0;
	while (num1>0) {

		rem1=num1%10;
		res1=(res1*10)+rem1;
		num1=num1/10;
	}System.out.println(res1);
	if (rev==res1) {
		System.out.println("pallindrome");
	} else {
System.out.println("not a pallindrome");
	}
	
	}
}
