package com.xingzhou.mybatisPlus.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xingzhou
 * @version 1.0.0
 * @ClassName MybatisPlusApplication.java
 * @Description TODO
 * @createTime 2022年03月14日 16:48:00
 */
@MapperScan("demo")
@SpringBootApplication
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
