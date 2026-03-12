package com.coforge.Day5MavenPrj;

import java.util.Enumeration;
import java.util.Vector;

public class DemoOnVector {
	public static void main(String[] args) {
		
	
	
	Vector<Integer> vector = new Vector<>();
	
	vector.add(56);
	vector.add(44);
	vector.add(78);
	vector.add(32);
	vector.add(56);
	vector.add(78);
	vector.add(67);
	vector.add(88);
	vector.add(55);
	vector.add(89); // till here the capacity is 10(default)
	vector.add(44);// becomes  double
	vector.add(66);
	vector.add(34);
	vector.add(76);
	vector.add(12);
	vector.add(45);
	vector.add(13);
	vector.add(14);
	vector.add(15);
	vector.add(16);
	
	System.out.println(vector.capacity());
	Enumeration<Integer> enums = vector.elements();
	System.out.println();
	while(enums.hasMoreElements()) {
		 System.out.println(enums.nextElement());
	}
	System.out.println();
	vector.trimToSize();
	System.out.println(vector.size());
	
	vector.ensureCapacity(42);
	System.out.println(vector.capacity());
	
	
	Vector<Integer> vector1 = new Vector<>();
	
	vector1.add(11);
	vector1.add(22);
	vector1.add(33);
	vector1.add(44);
	vector1.add(55);
	vector1.add(66);
	vector1.add(771);
	
	
	vector.addAll(vector1);
	
	System.out.println(vector);
	
//	vector.addFirst(2333);
//	vector.addLast(9999);
	
	System.out.println(vector.contains(vector1));
	
	System.out.println(vector.containsAll(vector1));
	
	System.out.println(vector.elementAt(4));
	
	
	
	
	
	}

}
