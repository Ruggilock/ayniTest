package ayni.ruggi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruggi on 8/1/17.
 */
@RestController
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "hola mundo";
    }
}
