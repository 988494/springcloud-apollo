package openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient//加不加都可以，我尝试了
@EnableHystrixDashboard//
//@EnableCircuitBreaker
public class HelloConsumerOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloConsumerOpenfeignApplication.class, args);
    }

}
