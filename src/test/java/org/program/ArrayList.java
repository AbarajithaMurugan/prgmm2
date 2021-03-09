package org.program;

import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		String s="opera";
		int sum=0;
		List<String>li= new java.util.ArrayList<String>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("four");
		li.add("7");
		System.out.println(li.size());                 
		for (String string : li) {
			//System.out.println(string);
		
		if (string.equals(s)) {
			System.out.println("present");
			
		}	else {
			System.out.println("opera is not present");
		}
		}
	
		String set = li.set(3,"4");
		System.out.println(li);
		for (int i = 0; i <li.size(); i++) {
			String string = li.get(i);
			int num = Integer.parseInt(string);
			sum=sum+num;		
			
		}System.out.println(sum);
	
		
	}

}
