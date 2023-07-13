package com.xuecheng.content.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xuecheng"})
@EnableSwagger2Doc
@Slf4j
//@MapperScan("com.xuecheng.content.mapper")
public class XuechengPlusContentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuechengPlusContentApiApplication.class, args);
        log.info("-------------------content服务启动成功---------------------");
    }

}
