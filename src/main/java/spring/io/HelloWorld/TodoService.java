package spring.io.HelloWorld;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
   @Autowired
    private TodoRepository todoRepository;


    public void printTodos(){
       System.out.println( todoRepository.geralltodo());
    }
}
