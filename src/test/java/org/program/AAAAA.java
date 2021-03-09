package org.program;

public class AAAAA {
	public static void main(String[] args) {
//		int res=1;
//		
//		int reminder;
//		for(int num=1000;num<=2000;num++){
//			int org=num;
//			while(num>0) {
//		reminder=num%10;
//		res =(res*10)+reminder;
//		num=num/10;
//
//			}
//			if(org==res){
//				System.out.println("pallindrome");
//			}}
//		int count = 0, c=0;
//		for(int n=1;n<=100;n++){
//			for(int i=2;i<n/2;i++){
//			if(n%i==0){
//
//			break;
//			
//			}
//			if(n%i==1) {
//				
//				System.out.println(n);
//		break;
//			}
//	}
//
//}
		
		int res=0;
		int rem=0;
		int num=0;
		int in;
for (int i = 1; i <100; i++) {
		
	String s=String.valueOf(i);
	
		 in=s.length();
	 num=Integer.parseInt(s);
	 while(num>0) {
 rem=num%10;
	 res=res+(rem)^in;
		 num=num/10;
	 
		
	 }
	 
	}System.out.println(res);	
	}
}
