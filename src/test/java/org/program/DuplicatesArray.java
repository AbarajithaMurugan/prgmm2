package org.program;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesArray {
	public static void main(String[] args) {

		int[] a={10,20,30,40,50,60,10,30,90,30};
		//get common///
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
							}}
}
		// remove duplicate///
		int[] a1={10,20,30,40,50,60,10,30,90,30};
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < a1.length; i++) {
			set.add(a1[i]);	
		}
		System.out.println(set);
		////// max and min in array/////
		int[] a2={10,20,30,40,50,60,10,30,90,30};
		int max=a2[0];
		for (int i = 0; i < a2.length; i++) {
			if (a[i]>max) {
				max=a[i];
				
				
			}
		}System.out.println(max);
		//min
		int[] a3={10,20,30,40,50,60,10,30,90,30};
		int min=a[0];
		for (int i = 0; i < a3.length; i++) {
			if (a[i]<min) {
				min=a[i];
				
			}
			
		}System.out.println(min);
		
		
		
}}