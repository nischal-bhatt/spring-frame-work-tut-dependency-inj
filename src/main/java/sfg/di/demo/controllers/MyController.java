package sfg.di.demo.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyController {

    public String sayHello() {
        System.out.println("hello world");

        return "hi folks";
    }
}
