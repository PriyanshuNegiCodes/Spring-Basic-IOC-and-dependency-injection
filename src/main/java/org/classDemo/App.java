package org.classDemo;

import org.classDemo.Configuration.AppConfig;
import org.classDemo.Domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Below line will create a IOC container or spring core containenr with the help of the Appconfig configuration class;
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        //bean1 is injected in obj1 is the dependecy injection
        //As we are getting object from the container it is the case of the loosely coupled or decoupled
        User obj1= (User) applicationContext.getBean("bean1");
        System.out.println(obj1);

        //bean2 is injected in obj1 is the dependecy injection
        User obj2=applicationContext.getBean("bean2", User.class);
        System.out.println(obj2);
    }
}
