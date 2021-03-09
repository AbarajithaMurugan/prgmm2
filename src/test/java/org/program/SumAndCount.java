package org.program;

public class SumAndCount {
	public static void main(String[] args) {
		int count=0;
		int res=0;
		int num=86687;
		int rem=0;
		while (num>0) {
			rem=num%10;
			res=res+rem;
			num=num/10;
			
			
		}System.out.println(res);
	//////// count digits//////////
		int num1=987653;
		while (num1>0) {
			rem=num1%10;
			count++;
			num1=num1/10;	
		}System.out.println(count);
		///////Armsstrong////////
		int n=151;
		int arm=n;
		int res1=0;
		while (n>0) {
			rem=n%10;
			res1=res1+rem*rem*rem;
			n=n/10;
			
			
		}System.out.println(res1);
		if (arm==res1) {
			System.out.println("armstrong num");
		} else {
System.out.println("not a armsstrong number");
		}
/////Factorial///////
int fact=1;
int number=6;
       for (int i = 1; i <=number; i++) {
    	   fact=fact*i;
		
	}System.out.println("factorial"+"\t"+fact);
			
		
	}

}
