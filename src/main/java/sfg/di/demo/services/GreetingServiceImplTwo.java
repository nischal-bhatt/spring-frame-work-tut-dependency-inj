package sfg.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplTwo implements GreetingService {
    @Override
    public String sayGreeting() {
        return "macdonalds coming soon";
    }
}
