package mywebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PSielinou on 2016/09/08.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){

        return "index";
    }
}
