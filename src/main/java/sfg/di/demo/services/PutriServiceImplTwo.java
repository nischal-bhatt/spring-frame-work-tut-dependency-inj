package sfg.di.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("ibne")
@Profile("cat")
public class PutriServiceImplTwo implements PutriService {
    @Override
    public String dog() {
        return "cat";
    }
}
