package apollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {

        @Value("${hello:apollo}")
        private String hello;

        @RequestMapping("/helloApollo")
        @ResponseBody
        public String sayApollo(){
            return "hello "+hello;
        }
}
