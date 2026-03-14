package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.coforge.Bean.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("cust-bean.xml");
        
        Customer cust = (Customer) context.getBean("cust");
        System.out.println(cust);
        ApplicationContext context1 = new ClassPathXmlApplicationContext("addr-bean.xml");

        
        Customer cust1 = (Customer) context1.getBean("cust1");
        System.out.println(cust1);
        
        ApplicationContext context2 = new ClassPathXmlApplicationContext("bytype.xml");
        Customer cust2 = (Customer) context2.getBean("cust2");
        System.out.println(cust2);


    }
}
