package com.coforge.Day5MavenPrj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	ArrayList alist = new ArrayList();
//	
//	alist.add("Mayank");
//	alist.add(56); // it is wrapped by a Wrapper class:- Integer.
//	alist.add(true);
//	alist.add(45.67f);
//	alist.add(45.67f); //can add duplicate elements
//	alist.add(56); ////can add duplicate elements
//	alist.add('5');
//	
//	alist.add(null); //list allow null values
//	alist.add(null); // duplicate allowed in null 
//	
//	for(int i = 0; i<alist.size(); i++) {
//		System.out.println(alist.get(i));
//	}
//	
	
		
	//---------USING GENERICS------------
		
		ArrayList<Integer> inAlist = new ArrayList<>();
		
		inAlist.add(56);
		inAlist.add(67);
		
		//inAlist("Mayank") //cant be added
		
		inAlist.add(36);
		inAlist.add(34);
		inAlist.add(34);
		
		//inAlist.add(null);
//		inAlist.add(null);
		
		System.out.println(inAlist);
		
		for(int i = 0; i<inAlist.size(); i++) {
			System.out.println(inAlist.get(i));
	}
		
		for(int ele : inAlist) {
			System.out.println(ele);
		}
		
		//Here null can be allowed. i.e; it can print null value
		
		for(Integer ele : inAlist) {
			System.out.println(ele);
		}
		
		//----BOXING AND UNBOXING
		
		
		Integer iobj = 567;// Boxing
		int i1 = iobj.intValue(); //Unboxing
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
//		Iterator<Integer> itr = inAlist.iterator();
//		while(itr.hasNext()) {
//			
//			Integer i = itr.next();
//			if(i == 34)
//				itr.remove();
//			System.out.println(i);
//		}
//		
//		System.out.println(inAlist);
//		

		
		
//		ListIterator<Integer> listItr = inAlist.listIterator();
//		
//		System.out.println("Forward direction list values");
//		
//		while(listItr.hasNext()) {
//			System.out.println(listItr.next());
//		}
//			
//		System.out.println("Reverse Direction of list values");
//		
//		while(listItr.hasPrevious()) {
//			System.out.println(listItr.previous());
//		}
		
		
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(54);
		alist.add(33);
		alist.add(98);
		alist.add(0, 11);
		
		inAlist.addAll(3,alist);
		System.out.println("After add all method");
		
		System.out.println(inAlist);
//		
//		inAlist.remove(2);
//		System.out.println(inAlist);
//		Integer i = 67;
//		inAlist.remove(i);
//		System.out.println(inAlist);
		
		
		
//		inAlist.removeAll(alist);
//		
//		System.out.println("Afer remove all collection");
//		System.out.println(inAlist);
		
		inAlist.replaceAll(e->e+10);
		
		System.out.println(inAlist);
		
//		System.out.println("Before clear" +alist);
//		alist.clear();
//		
//		System.out.println("After clear" +alist);
		
		Integer i = 999;
		//inAlist.addLast(999);
		
		
//		
//		ArrayList<Integer> clonedArrayList = (ArrayList<Integer>) alist.clone(); 
//		
//		System.out.println(clonedArrayList);
//		
//		
//		System.out.println(alist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
//		
//		
//		//clonedArrayList.add(78);
//		
//		alist.add(67);
//		
//		System.out.println(alist);
//		System.out.println(clonedArrayList);
//		
//		
//		System.out.println(alist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
//		
//		
//	
//		System.out.println(alist.contains(67));
//		
//		System.out.println(alist.containsAll(inAlist));
//		
	alist.forEach(e -> System.out.println(e));
	
	System.out.println(alist.indexOf(98));
	
	inAlist.retainAll(alist);
	
	System.out.println(inAlist);
	
	System.out.println(alist.toString().getClass());
	
	
	//alist.sort(null);
	
	Collections.sort(alist);
	System.out.println(alist);
	
//	System.out.println(alist.toArray());
	
	Integer[] irr = alist.toArray(new Integer[0]);
	System.out.println(irr[2]);
	
	Integer[] arr = {34,56,32,43,76,87};
	
	List<Integer> list = Arrays.asList(arr);
	
		System.out.println(list);
		
	}

}
