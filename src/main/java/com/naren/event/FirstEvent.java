/**
 * 
 */
package com.naren.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author nstanwar
 *
 */
public class FirstEvent extends  Event{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FirstEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public String toString(){
		return "My Custom Event";
	}

}
