package org.program;

import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		Set<String> set=new java.util.HashSet<String>();
		set.add("windows");
		set.add("os x");
		set.add("ubuntu");
		set.add("windows");
		System.out.println(set);
		System.out.println(set.size());
		
		
		
	}

}
