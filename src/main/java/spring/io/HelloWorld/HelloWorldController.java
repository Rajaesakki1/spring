package spring.io.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helo")
    public String HelloWorld(){
        return "Hello World";
    }
    @GetMapping("/helo2")
    String getindentity(){
        return "page2";
    }
    @GetMapping("/hi")
    String getting(@RequestParam (defaultValue = "raji")String name){
        return "Hello"+name;
    }
}
