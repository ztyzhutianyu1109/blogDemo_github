package com.ty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.ty.mapper")
public class BlogdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogdemoApplication.class, args);
    }

}
