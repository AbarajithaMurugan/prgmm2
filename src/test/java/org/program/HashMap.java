package org.program;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new java.util.HashMap<Integer,String>();
		map.put(1, "windows");
		map.put(2, "ubuntu");
		map.put(3, "osx");
		map.put(4, "new os");
		map.put(4,"New os11");
		System.out.println(map);
		System.out.println(map.size());
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		Set<Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);
	}

}
