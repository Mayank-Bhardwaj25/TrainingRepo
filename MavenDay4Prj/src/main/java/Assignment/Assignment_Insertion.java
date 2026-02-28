package Assignment;

import java.util.Scanner;

public class Assignment_Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int arr[] = {10, 20, 30, 40, 50, 60, 70};
		System.out.println("Original Array is :- ");
		for(int num :arr) {
			System.out.println(num);
		}
		System.out.println("Enter the position where elemnt must be inserted");
		int pos = sc.nextInt();
		
		System.out.println("Enter the value of new Element");
		int val = sc.nextInt();

		if(pos < 0 || pos > arr.length) {
			System.out.println("Invalid index");
			return;
		}
		
		int[] newArr = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[pos] = val;
		
		for(int i=pos; i<arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		
		System.out.println("Modified Array is :-");
		
		for(int num :newArr) {
			System.out.println(num + " ");
		}
		
		
	}

}
