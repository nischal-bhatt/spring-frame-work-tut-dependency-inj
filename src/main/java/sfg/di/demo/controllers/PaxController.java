package sfg.di.demo.controllers;

import org.springframework.stereotype.Controller;
import sfg.di.demo.services.PutriService;
@Controller
public class PaxController {

    private PutriService putriService;

    public PaxController(PutriService putriService) {
        this.putriService = putriService;
    }

    public String say()
    {
        return putriService.dog();
    }
}
