package spring.io.HelloWorld;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    String geralltodo(){
        return "Todos";
    }
}
