package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    { 
     @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Book b1=context.getBean("book1",Book.class);
        System.out.println(b1);
        Book b2=context.getBean("book2",Book.class);
        System.out.println(b2);
        Book b3=context.getBean("book3",Book.class);
        System.out.println(b3);
        CollectionsData c=context.getBean("collection",CollectionsData.class);
        System.out.println(c);
        c.bookInfo();
        
    }
}
