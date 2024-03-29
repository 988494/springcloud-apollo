package apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class HelloApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApolloApplication.class, args);
    }

}
