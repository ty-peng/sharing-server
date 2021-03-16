package com.typeng.sharing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.typeng.sharing.mapper")
public class SharingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingServerApplication.class, args);
    }

}
