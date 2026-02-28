package com.coforge.MavenDay4Prj;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {22,23,24,25, 65, 87};
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int i=0;
		for(; i<arr.length; i++) {
			
			if(arr[i] == key) {
				System.out.println("Element Found");
				break;
			}
			if(i == arr.length)
				System.out.println("not found");
			
		}
		
		
		

	}

}
