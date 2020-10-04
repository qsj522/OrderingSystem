package com.QSJ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.QSJ
 * @ClassName: AccountApplication
 * @Author: SamSung
 * @CreateTime: 2020-10-03 10:23
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.QSJ.repository")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
