package com.coforge.MavenDay4Prj;

import java.util.Scanner;

public class DemoOnArray {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Prinitng array Elements");
		
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]%2==0)
//			System.out.println(arr[i]);
//		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
			System.out.println(sum);
			
			
			
		
		
		

	}

}
