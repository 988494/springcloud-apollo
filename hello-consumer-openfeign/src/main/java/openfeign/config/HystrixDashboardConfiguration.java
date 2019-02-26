package openfeign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.hystrix.contrib.sample.stream.HystrixSampleSseServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<HystrixSampleSseServlet> hystrixSampleSseServletServletRegistrationBean = new ServletRegistrationBean<>(hystrixMetricsStreamServlet);
        hystrixSampleSseServletServletRegistrationBean.setLoadOnStartup(1);
        hystrixSampleSseServletServletRegistrationBean.addUrlMappings("/hystrix.stream");//拦截/hystrix.stream请求
        hystrixSampleSseServletServletRegistrationBean.setName("HystrixSampleSseServlet");//servlet名字HystrixSampleSseServlet
        return hystrixSampleSseServletServletRegistrationBean;
    }
}
