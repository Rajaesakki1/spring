package spring.io.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/get")
    String getTodo(){
        todoService.printTodos();
        return "Todo";
    }

    @GetMapping("/{id}")
    String getTodobyId(@PathVariable long id){
        return "Todo with id"+ id;
    }

}
