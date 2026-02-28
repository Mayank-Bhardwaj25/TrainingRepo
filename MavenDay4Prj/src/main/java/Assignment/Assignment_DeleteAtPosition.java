package Assignment;

import java.util.Scanner;

public class Assignment_DeleteAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		

		int [] arr = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println("Original Array is :- ");
		for(int num :arr) {
			System.out.println(num);
		}
		
		System.out.println("Enter the position where elemnt must be deleted");
		
		
		int pos = sc.nextInt();
		if(pos < 0 || pos>=arr.length) {
			System.out.println("Invalid index..");
			
			return;
		}
		
		int[] newArr = new int[arr.length - 1];
		
		//copy elements before position
		
		for(int i=0; i<pos; i++) {
			newArr[i] = arr[i];
		}
		
		//shifting
		for(int i=pos+1; i<arr.length; i++) {
			newArr[i-1] = arr[i];
		}
		
		System.out.println("New Array: ");
		
		for(int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
		
	}

}
