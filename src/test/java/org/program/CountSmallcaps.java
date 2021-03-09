package org.program;

public class CountSmallcaps {
	public static void main(String[] args) {
		String s="HAPPYnewyear@2020";
		int count=0;
		int caps=0;
		int small=0;
int num=0;

for (int i = 0; i <s.length(); i++) {
	if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
		small++;
		
	}
	else if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
		caps++;
		
	}
	else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
		num++;
		
	}
	else {
		count++;
	}
	
}
System.out.println("small"+small);
System.out.println("caps"+caps);
System.out.println("number"+num);
System.out.println("others"+count);
	}}


