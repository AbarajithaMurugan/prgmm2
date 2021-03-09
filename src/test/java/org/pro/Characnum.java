package org.pro;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Characnum {
	public static void main(String[] args) {
		String s="Abarajitha";
/*		char[] charArray = s.toCharArray();
		
		Set<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i <charArray.length; i++) {
			 set.add(charArray[i]);
		
		}System.out.println(set);
			 	}*/

		///////// count///////////
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
		
			if (map.containsKey(c)) {
				int in=map.get(c);
				
			map.put(c,in+1);
				
				
			} else {
map.put(c, 1);
			}
			
		}
		System.out.println(map);

	}
	
	}
	
