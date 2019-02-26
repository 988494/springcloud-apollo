package consumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexRibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index/{message}")
    public String index(@PathVariable("message") String message){
        return restTemplate.getForObject("http://hello-provider/hello/"+message,String.class);
    }
}
