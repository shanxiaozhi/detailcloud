package com.yc.springcloud81_2.consumer.config;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liyan
 * @create 2020-10-2020/10/8-16:06
 */
@SpringBootConfiguration
public class RestTemplateConfig {
    @Bean //创建一个 restTemplate 的模板操作对象
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
