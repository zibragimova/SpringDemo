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

    	Employee emp2=(Employee) appContext.getBean("employee1");
    	System.out.println( emp2 );
    	
    	System.out.println(Integer.toHexString(System.identityHashCode(emp)));
    	System.out.println(Integer.toHexString(System.identityHashCode(emp2)));
    	
    	if(emp==emp2) {
    		System.out.println("THEY HAVE SAME ADDRESS");
    	}else {
    		System.out.println("THEY HAVE DIFF ADDRESS");
    	}
    	
    	Employee emp3=(Employee) appContext.getBean("employee2");
    	System.out.println( emp );

    	Employee emp4=(Employee) appContext.getBean("employee2");
    	System.out.println( emp2 );
    	
    	System.out.println(Integer.toHexString(System.identityHashCode(emp3)));
    	System.out.println(Integer.toHexString(System.identityHashCode(emp4)));
    	
    	if(emp3==emp4) {
    		System.out.println("THEY HAVE SAME ADDRESS");
    	}else {
    		System.out.println("THEY HAVE DIFF ADDRESS");
    	}

    
    	
    }
}
