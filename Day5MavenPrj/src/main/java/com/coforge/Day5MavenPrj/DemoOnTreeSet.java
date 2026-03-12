package com.coforge.Day5MavenPrj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoOnTreeSet {
	
	public static void main(String[] args) {
		
		
		TreeSet<Student> studentTree = new TreeSet<Student>();
		
		Student s1 = new Student(123, "Mayank" ,90);
		Student s2 = new Student(456, "Rajat" ,40);
		Student s3 = new Student(789, "Gaurav" ,67);
		Student s4 = new Student(321, "Ayush" ,50);
		Student s5 = new Student(555, "Nitin" ,98);
		Student s6 = new Student(999, "Akash" ,70);
		
		studentTree .add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		studentTree.add(s6);
		
		studentTree.forEach(s -> System.out.println(s));
		
		System.out.println("----------------------------------------------------");
		
		Iterator<Student> itr = studentTree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------------------");
		itr = studentTree.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------------------");

		System.out.println("descending set");
		Set<Student> set = studentTree.descendingSet();
		
		set.forEach(s -> System.out.println(s));
		System.out.println();
		//print the subset of student tree
		
		System.out.println("-----------------------------------------------------");

		
		Student fromstud = new Student(123, "", 0);
		Student toStud = new Student(1232, "", 0.0);
		Set<Student>subset = studentTree.subSet(fromstud, toStud);
		
		System.out.println("-----------------------------------------------------");
		
		
        System.out.println("Student of subtree ");
        subset.forEach(s -> System.out.println(s));
		//System.out.println(studentTree.subSet(s5, s6));
        System.out.println("-----------------------------------------------------");
//      Student s = new Student(125, "", 90);
        
        Student s = new Student(2342, "", 90);
        System.out.println(studentTree.ceiling(s));
        System.out.println(studentTree.floor(s));
        
        System.out.println(studentTree.higher(s));
       
        
	}

}
