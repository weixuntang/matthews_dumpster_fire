package matwx.dumpster.fire.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import matwx.dumpster.fire.model.BaseballCoach;
import matwx.dumpster.fire.model.FootballCoach;

/**
 * Dependency Injection is the main functionality provided by Spring
 * IOC(Inversion of Control). The Spring-Core module is responsible for
 * injecting dependencies through either Constructor or Setter methods. The
 * design principle of Inversion of Control emphasizes keeping the Java classes
 * independent of each other and the container frees them from object creation
 * and maintenance. These classes, managed by Spring, must adhere to the
 * standard definition of Java-Bean. Dependency Injection in Spring also ensures
 * loose-coupling between the classes.
 * 
 * https://www.geeksforgeeks.org/spring-dependency-injection-with-example
 * 
 * Test class to do live demo, for Dependency Injection
 * 
 */

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext rootctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		switch ("B") {
			case "F":
				invokeFootballCoach(rootctx);
				break;
			case "B":
				invokeBaseballCoach(rootctx);
				break;
			default:
		}

		rootctx.close();
	}

	/**
	 * Invoking football coach, performing setter injection.
	 * 
	 * @param rootctx
	 */
	public static void invokeFootballCoach(ClassPathXmlApplicationContext rootctx) {

		FootballCoach footballCoach = rootctx.getBean("footballCoach", FootballCoach.class);

		System.out.println(footballCoach.practiceWorkout());

		System.out.println(footballCoach.getCurrentTime());

	}

	/**
	 * Invoking baseball coach, performing setter injection.
	 * 
	 * @param rootctx
	 */
	public static void invokeBaseballCoach(ClassPathXmlApplicationContext rootctx) {

		BaseballCoach baseballCoach = rootctx.getBean("baseballCoach", BaseballCoach.class);

		System.out.println(baseballCoach.practiceWorkout());

		System.out.println(baseballCoach.getCurrentTime());

	}

}
