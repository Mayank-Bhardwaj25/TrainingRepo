package com.coforge.Day5MavenPrj;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(78);
		llist.add(34);
		llist.add(23);
		llist.add(67);
		llist.add(10);
		System.out.println(llist);
		
		llist.addFirst(55);
		 
		llist.addLast(77);

		System.out.println(llist);
		
		System.out.println(llist.element());
		
		LinkedList<Integer> llist1 = new LinkedList<Integer>();
		
		llist1.add(78);
		llist1.add(34);
		llist1.add(23);
		llist1.add(67);
		llist1.add(10);
		
		llist1.addFirst(55);
		 
		llist1.addLast(77);
		System.out.println(llist.equals(llist1));
		
		//List<Integer> list = llist.reversed();
		
		//System.out.println(list);
		
		Iterator<Integer> itr = llist.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		//Create mployee ll WITH 10 RECORDS SORT USING COLLECTION.SORT ON SALARY BASED
		//sort using comparators:-, Branch based, dept based, nam based,  then salary based.
		
	//emplyoee properties:- ename, eid, dept, branch
		
	
		
		
		
		
	}

}
