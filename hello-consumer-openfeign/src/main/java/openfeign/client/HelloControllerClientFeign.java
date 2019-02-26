package openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hello-provider",fallback = HelloControllerClientFeignImp.class)
public interface HelloControllerClientFeign {
    @GetMapping("/hello/{message}")
    public String hello(@PathVariable("message") String message);
}
