package sfg.di.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.di.demo.services.GreetingService;
import sfg.di.demo.services.PalaService;

@Controller
public class ConstructorInjectedController {

    public GreetingService greetingService;

    public PalaService palaService;


    public ConstructorInjectedController(@Qualifier("greetingServiceImplTwo")GreetingService greetingService,
                                         PalaService palaService) {
        this.greetingService = greetingService;
        this.palaService = palaService;
    }

    public String sayGreeting() {
        return this.greetingService.sayGreeting() + this.palaService.pala();


    }
}
