package core;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.OnClose;
@ResponseBody
@Controller
//@RestController
public class ComponentaController {
    // returns json xml format get post ect...

    //GET  HTTP Method
    // http://localhost:8080/hello

    @GetMapping("/hello")
    public String Hello(){
        return "Hello";
    }

}
