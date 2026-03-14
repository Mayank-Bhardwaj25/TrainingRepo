package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.Beans.Book;
import com.coforge.Beans.Order;
import com.coforge.Beans.Student;
import com.coforge.configuration.BookOrderConfig;
import com.coforge.configuration.StudentConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //ApplicationContext context =new  ClassPathXmlApplicationContext("book-bean.xml");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(BookOrderConfig.class);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(StudentConfig.class);
//        ApplicationContext context2 = new AnnotationConfigApplicationContext(StudentConfig.class);

        Book book =(Book) context.getBean("book");
        System.out.println(book);
        
        Order ord = (Order) context.getBean("ord");
        System.out.println(ord);
        Student std = (Student) context1.getBean("std");
        System.out.println(std);
   

        
    }
}
