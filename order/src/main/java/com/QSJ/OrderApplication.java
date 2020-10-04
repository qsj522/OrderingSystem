package com.QSJ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.QSJ
 * @ClassName: OrderApplication
 * @Author: SamSung
 * @CreateTime: 2020-09-30 19:46
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.QSJ.repository")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
