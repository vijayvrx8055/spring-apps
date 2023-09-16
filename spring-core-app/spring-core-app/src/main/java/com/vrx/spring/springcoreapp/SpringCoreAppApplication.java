package com.vrx.spring.springcoreapp;

import com.vrx.spring.springcoreapp.lifecycle.Student;
import com.vrx.spring.springcoreapp.model.MovieListener;
import com.vrx.spring.springcoreapp.scope.Agent;
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

		System.out.println("-----------------------");
		Agent agent = context.getBean(Agent.class);
		System.out.println(agent);
		agent.work();
		// 2nd request for agent bean
		Agent agent1 = context.getBean(Agent.class);
		System.out.println(agent1);
		// both beans are same = singleton scope is available by default

		System.out.println("------------------------------");
		Agent agent2=context.getBean(Agent.class);
		System.out.println(agent2);
		System.out.println(agent2.getPolicy());
		Agent agent3=context.getBean(Agent.class);
		System.out.println(agent3);
		System.out.println(agent3.getPolicy());

		System.out.println("------------------------------------");
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}


}
