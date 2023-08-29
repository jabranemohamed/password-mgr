package com.mhj.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestPasswordMgrApplication {


    public static void main(String[] args) {
        SpringApplication.from(PasswordMgrApplication::main).with(TestPasswordMgrApplication.class).run(args);
    }

}
