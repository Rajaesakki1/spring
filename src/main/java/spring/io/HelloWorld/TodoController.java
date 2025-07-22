package spring.io.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {
    @GetMapping("/get")
    String getTodo(){
        return "Todo";
    }

    @GetMapping("/{id}")
    String getTodobyId(@PathVariable long id){
        return "Todo with id"+ id;
    }

}
