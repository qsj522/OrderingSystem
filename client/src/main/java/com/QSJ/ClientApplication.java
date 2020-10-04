package com.QSJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Package: com.QSJ
 * @ClassName: ClientApplication
 * @Author: SamSung
 * @CreateTime: 2020-10-01 15:21
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
