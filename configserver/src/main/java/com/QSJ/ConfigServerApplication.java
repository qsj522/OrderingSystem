package com.QSJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Package: com.QSJ
 * @ClassName: ConfigServerApplication
 * @Author: SamSung
 * @CreateTime: 2020-09-30 19:38
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
