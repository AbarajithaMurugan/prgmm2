package org.program;

public class DescendingArray {
	public static void main(String[] args) {
		
			int[] a={10,20,30,40,50,60,10,30,90,30};
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j]>a[i]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					
				}
				
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println("descendingorder"+a[i]);
			}
			//// second max////
			System.out.println("2nd max"+"\t"+a[a.length-9]);
			System.out.println("3min"+"\t"+a[a.length-2]);
	}

}
