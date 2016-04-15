/**
 * 
 */
package com.naren.event.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.naren.event.FirstEvent;
import com.naren.event.handler.FirstEventHandler;
import com.naren.event.publish.EventPublisher;
import com.naren.spring.environmtn.EnvironmentTest;

/**
 * @author nstanwar
 *
 */
public class TestMyEvents {

	/**
	 * 
	 */
	public TestMyEvents() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Test Event publish
		
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("spring-event.xml");
		FirstEvent event=new FirstEvent(new Object());
		EventPublisher cvp =(EventPublisher) context.getBean("eventPublisher");
		cvp.publish(event);  
		cvp.publish(event);
		
		//Test Message Resource
		
		MessageSource resources = new ClassPathXmlApplicationContext("spring-event.xml");
		String message = resources.getMessage("message", null, "Default", null); 
		String message2 = resources.getMessage("argument.required",
				new Object [] {"userDao"}, "Required", null);
		System.out.println(message);
		System.out.println(message2);
		
		//Test Environemtn
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(EnvironmentTest.class);
		Environment env = appContext.getEnvironment();
		System.out.println(env.getProperty("bean.name"));
		FirstEventHandler handler = appContext.getBean(FirstEventHandler.class);
		handler.getEnvProp();

	}
	
	

}
