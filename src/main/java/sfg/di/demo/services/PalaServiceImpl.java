package sfg.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PalaServiceImpl implements PalaService {
    @Override
    public String pala() {
        return "one";
    }
}
