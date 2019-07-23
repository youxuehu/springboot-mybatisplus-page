package com.example.springbootmybatispluspagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.springbootmybatispluspagehelper.mapper")
public class SpringbootMybatisplusPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisplusPagehelperApplication.class, args);
    }

}
