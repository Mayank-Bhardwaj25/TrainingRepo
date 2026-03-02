package com.coforge.MavenDay6Prj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Mayank"); //entry
		hashMap.put(2, "Rajat");
		hashMap.put(3, "Gaurav");
		hashMap.put(4, "Mayank");// values can be duplicate  but not keys
		
		System.out.println(hashMap);
		
		for(Integer key : hashMap.keySet()) {
			System.out.println(key);
		}
		
		for(String val: hashMap.values()) {
			System.out.println(val);
		}
		
//		hashMap.put(null, "Amit");
//		System.out.println(hashMap);
		
		System.out.println(hashMap.containsKey(5));
		System.out.println(hashMap.containsValue("Mayank"));
		
		System.out.println();
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		System.out.println(entrySet);
		
        System.out.println();
        
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
             System.out.println(hashMap.get(3));
             
             System.out.println();
             
             TreeMap<Integer, String> fruitTree = new TreeMap<>();
             fruitTree.put(1, "Apple");
             fruitTree.put(2, "Grapes");
             fruitTree.put(3, "Mango");
             fruitTree.put(4, "WaterMelon");
             
             System.out.println(fruitTree);
             System.out.println();
            for(Integer key : fruitTree.keySet()) {
            	
            	System.out.println(key + " -> " +fruitTree.get(key));
            }
             
	}

	
}
