package com.hgh.weblog.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.error("这是一行 Error 级别日志");
        log.warn("这是一行 Warn 级别日志");

        // 占位符
        String test = "测试";
        log.info("这是一行带有占位符日志， 内容：{}", test);
    }

}
