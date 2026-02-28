package com.coforge.MavenDay4Prj;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        //modified the main file... previous jar will not reflect the changes.
//        System.out.println("Modified the file");
    	
    	
    	MyInterface mi = new DemoClass();
    	mi.display();
    	mi.printDetails();
    	
    	mi = new Hello();
    	mi.display();
    	
    	MyInterface.UseParking("coforge");
    	
    	
    }
}
