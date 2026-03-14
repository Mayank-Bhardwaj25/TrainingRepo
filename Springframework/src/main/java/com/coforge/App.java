package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.Beans.Employee;
import com.coforge.Beans.HelloBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       //HelloBean hb = new HelloBean();
        //hb.sayHello();
        
        //ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("emp-bean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("employee-bean.xml");


//        HelloBean hbean = (HelloBean) context.getBean("hello"); //downcasting
//        	hbean.sayHello();
//        	hbean.printName();
        
        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp);
        
//        Employee emp1 = (Employee) context.getBean("emp");
//        System.out.println(emp1);
//        
//        System.out.println(emp.hashCode());
//        System.out.println(emp1.hashCode());
        
        
    }
}
