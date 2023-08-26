package com.vrx.spring.springcoreapp;

import com.vrx.spring.springcoreapp.model.MovieListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
/* @SpringBootApplication is a combination of below tags
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
* */
public class SpringCoreAppApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringCoreAppApplication.class, args); // got the context
		MovieListener movieListener = context.getBean("movieListener", MovieListener.class); // got bean from the context
		movieListener.printMovie(); // ran the method of the fetched object
	}

}
