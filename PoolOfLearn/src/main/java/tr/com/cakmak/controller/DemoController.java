package tr.com.cakmak.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(
            value = {"/test","/test2"},
            method = {RequestMethod.GET,RequestMethod.POST},
            consumes = {"application/json","application/xml","text/html","text/plain", MediaType.ALL_VALUE},
            produces = {"application/json","application/xml","text/html"}
    )
    @ResponseBody
    public String testMethod(){
        return "Test";
    }

}
