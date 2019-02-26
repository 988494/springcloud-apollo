package openfeign.controller;

import openfeign.client.HelloControllerClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexFeignController {

    @Autowired
    private HelloControllerClientFeign helloControllerClientFeign;
    @GetMapping("/index/{message}")
    public String index(@PathVariable("message") String message){
        return helloControllerClientFeign.hello(message);
    }
}
