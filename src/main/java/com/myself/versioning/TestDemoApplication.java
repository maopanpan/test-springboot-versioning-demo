package com.myself.versioning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类名称：TestDemoApplication<br>
 * 类描述：<br>
 * 创建时间：2019年05月21日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
public class TestDemoApplication {
    private final static Logger log = LoggerFactory.getLogger(TestDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TestDemoApplication.class, args);

    }

}
