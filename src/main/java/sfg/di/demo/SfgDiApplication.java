package sfg.di.demo;

import javafx.scene.effect.SepiaTone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import sfg.di.demo.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController)run.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) run.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController
				= (SetterInjectedController) run.getBean("setterInjectedController");

		System.out.println(setterInjectedController.sayGreeting());

		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) run.getBean ("constructorInjectedController");

		System.out.println(constructorInjectedController.sayGreeting());

		PaxController paxController
				= (PaxController) run.getBean("paxController");
		System.out.println(paxController.say());
	}

}
