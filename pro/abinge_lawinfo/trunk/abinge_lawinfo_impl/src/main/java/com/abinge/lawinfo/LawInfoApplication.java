package com.abinge.lawinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbingjie</a> at  18:37.
 *
 * @Author: chenbingjie
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
@SpringBootApplication
@EnableScheduling
public class LawInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LawInfoApplication.class, args);
    }
}
