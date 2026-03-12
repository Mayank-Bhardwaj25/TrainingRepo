package com.coforge.Day5MavenPrj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class DemoOnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> hset = new HashSet<>();
//		
//		hset.add(78);
//		hset.add(33);
//		hset.add(90);
//
//		hset.add(12);
//		System.out.println(hset);
		
		//hset.add(90);//no duplicates
		//hset.add(null); //only one null value allowed
		//System.out.println(hset);
		
//		for(int i = 0; i<hset.size(); i++) {
//			System.out.println(hset.get(i));
//		}
		
//		for(int i: hset) {
//			System.out.println(i);
//		}
//		
//	Predicate<Integer> isEven = (e) -> e%2 == 0;
//	hset.removeIf(isEven);
//	System.out.println(hset);
//	
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
	lset.add(78);
	lset.add(33);
	lset.add(90);
	lset.add(12);
	
	System.out.println(lset);
	
	Iterator<Integer> itr = lset.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	}

}
