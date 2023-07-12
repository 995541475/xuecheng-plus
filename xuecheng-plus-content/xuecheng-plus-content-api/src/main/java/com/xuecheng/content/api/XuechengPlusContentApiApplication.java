package com.xuecheng.content.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xuecheng"})
@EnableSwagger2Doc
public class XuechengPlusContentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuechengPlusContentApiApplication.class, args);
    }

}
