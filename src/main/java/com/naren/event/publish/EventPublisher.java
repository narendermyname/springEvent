/**
 * 
 */
package com.naren.event.publish;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.naren.event.Event;

/**
 * @author nstanwar
 *
 */
public class EventPublisher implements ApplicationEventPublisherAware {

	/**
	 * 
	 */
	private ApplicationEventPublisher applicationEventPublisher;
	public EventPublisher() {
		// TODO Auto-generated constructor stub
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = applicationEventPublisher;
		
	}
	
	public void publish(ApplicationEvent e){
		Event fEvent =(Event) e;
		applicationEventPublisher.publishEvent(fEvent);
	}

}
