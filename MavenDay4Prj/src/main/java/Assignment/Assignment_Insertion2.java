package Assignment;

import java.util.Scanner;

public class Assignment_Insertion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {10, 20, 30, 40, 50, 60, 70};
		System.out.println("Original Array is :-");
		
		for(int num :arr) {
			System.out.println(num + " ");
		}
		System.out.println("Enter the value to be entered");
		
		int val = sc.nextInt();
		
		int [] newArr = new int[arr.length+1];
		
		// copying the elements into new array
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[newArr.length-1] = val;
		System.out.println("New Array is :-");
		
		for(int num : newArr) {
			System.out.println(num + " ");
		}
		
		
		


	}

}
