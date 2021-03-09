package org.program;

public class OddAndEven {
	public static void main(String[] args) {
		int c=0;int o=0;int sum=0;
		for (int i = 0; i <10; i++) {
			if (i%2==0) {
				System.out.println("even"+"\t"+i);
				
			} else {
System.out.println("odd"+"\t"+i);

			}
			
		}
		for (int i = 0; i <10; i++) {
			if (i%2==0) {
				c++;
				
				
			} 
			
		}System.out.println(c);
		
		for (int i = 0; i <10; i++) {
			if (i%2==1) {
				o++;
				
				
			} 
			
		}System.out.println(o);
		
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				sum=sum+i;
				
			} 
			
		}System.out.println(sum);
		
	}

}
