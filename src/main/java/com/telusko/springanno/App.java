package com.telusko.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */

// This topic is Spring Core Annotation.
public class App 
{
    public static void main( String[] args )
    {
    	
    	@SuppressWarnings("resource")
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s7= factory.getBean(Samsung.class);
    	s7.config();
    	
    	
       
    }
}
