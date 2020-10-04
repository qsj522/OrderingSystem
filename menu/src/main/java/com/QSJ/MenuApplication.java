package com.QSJ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.QSJ
 * @ClassName: MenuApplication
 * @Author: SamSung
 * @CreateTime: 2020-09-30 20:13
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.QSJ.repository")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }
}
