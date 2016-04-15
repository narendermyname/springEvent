/**
 * 
 */
package com.naren.spring.environmtn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.naren.event.handler.FirstEventHandler;

/**
 * @author nstanwar
 *
 */
@Configuration 
@PropertySource("classpath:app.properties")
public class EnvironmentTest {

	/**
	 * 
	 */
	public EnvironmentTest() {
	}

	@Autowired
	Environment env;
	
	@Bean
	public FirstEventHandler testBean() {
		FirstEventHandler testBean = new FirstEventHandler(); 
		testBean.setBean(env.getProperty("bean.name")); return testBean;
	}
}
