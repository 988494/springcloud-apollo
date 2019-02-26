package openfeign.client;

import org.springframework.stereotype.Component;

@Component
public class HelloControllerClientFeignImp implements HelloControllerClientFeign {
    @Override
    public String hello(String message) {
        return "网络异常";
    }
}
