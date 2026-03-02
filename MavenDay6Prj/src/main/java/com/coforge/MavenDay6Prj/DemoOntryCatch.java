package com.coforge.MavenDay6Prj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoOntryCatch {

	
	public static void readFile() throws FileNotFoundException {
		FileReader f = new FileReader("file.txt");
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		int a = 5, b=0;
//		try {
//			System.out.println(a/b); 
//		}
//		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) { //same level exception must be placed along with pipe
//			
//			
//			System.out.println(" Arithmetic Exception occured");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//		}
//		catch (RuntimeException e) {
//			System.out.println("Runtime Exception occured");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//			// TODO: handle exception
//		}
//		catch (Exception e) {
//			System.out.println(" Parent Exception occured");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			// TODO: handle exception
//		}
		
		
//		String s = null;
//	
//		try {
//			System.out.println(s.charAt(3));
//		}
//		catch (NullPointerException e) {
//			
//			System.out.println("Null Pointer Exception occured");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			// TODO: handle exception
//		}
//		
//		finally {
//			System.out.println("application completed");
//		}
		
		
		
		
//		catch (Exception e) {
//			System.out.println("Exception occured ");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			//System.out.println(e.getCause());
//			// TODO: handle exception
//		}
		
		 //this cant be executed  because of above exception
		
		
		//----------CHECKED EXCEPTION--------------------
		
		
		//System.out.println("file not found");
		
//		FileReader reader = null;
//		
//		try {
//			reader = new FileReader("data.txt");
//				int ch;
//				while((ch=reader.read()) !=-1)
//					System.out.println((char) ch);
//		}
//		
//		catch (IOException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
//		finally {
//			try {
//				if(reader!=null)
//					reader.close();
//			} catch (IOException e2) {
//				// TODO: handle exception
//				System.out.println(" reader exception Handled ");
//			}
//				
//			
//		}
		
		
		readFile();
		
	}
	
}
