/**
 * 
 */
package com.naren.event.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

import com.naren.event.Event;
import com.naren.event.FirstEvent;

/**
 * @author nstanwar
 *
 */
public class FirstEventHandler implements ApplicationListener<Event>{

	@Autowired
	Environment env;
	/**
	 * 
	 */
	public FirstEventHandler() {
	}

	public void onApplicationEvent(Event event) {
		if(event instanceof FirstEvent){
		 System.out.println(event.toString());
		}
	}
	
	public void setBean(String str){
		System.out.println("Str  ::"+str);
		
	}
	
	public void getEnvProp(){
		System.out.println(env.getProperty("bean.name"));
	}

}
