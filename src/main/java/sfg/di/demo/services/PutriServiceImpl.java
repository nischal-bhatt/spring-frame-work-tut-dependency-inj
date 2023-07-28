package sfg.di.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("batuta")
@Profile({"dog","default"})
public class PutriServiceImpl implements PutriService {
    @Override
    public String dog() {
        return "dog";
    }
}
