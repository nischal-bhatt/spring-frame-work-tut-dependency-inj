package sfg.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PalaServiceImplTwo implements PalaService {
    @Override
    public String pala() {
        return "two";
    }
}
