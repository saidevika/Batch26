package jrout.tutorial.SpringBoot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/helloworld")
    @ResponseBody
    String helloWorld() {
        return "Hello World! " + new java.util.Date();
    }

    @RequestMapping("/byeworld")
    @ResponseBody
    String byeWorld() {
        return "Bye World! " + new java.util.Date();
    }
    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}