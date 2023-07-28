package sfg.di.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.di.demo.services.GreetingService;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    @Autowired
    @Qualifier("greetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
       return this.greetingService.sayGreeting();

    }
}
