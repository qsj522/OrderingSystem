package com.QSJ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.QSJ
 * @ClassName: UserApplication
 * @Author: SamSung
 * @CreateTime: 2020-10-02 9:31
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.QSJ.repository")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
