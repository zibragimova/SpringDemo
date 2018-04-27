package com.synergisticit.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synergisticit.domain.Employee;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext= new ClassPathXmlApplicationContext("beans.xml");
    	Employee emp=(Employee) appContext.getBean("employee1");
        System.out.println( emp );
    }
}
