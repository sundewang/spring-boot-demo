package xyz.sun.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.sun.web.entity.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author sundewang
 * @date 2023/11/10
 */
@RestController
public class GreetingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/log")
    public String log(@RequestParam(value = "count") int count) {
        long a = 1000;
        System.out.println(a);
        LOGGER.error("count:{}", count);
        try {
            int result = 1 / count;
            LOGGER.info("result: {}", result);
        } catch (Exception e) {
            LOGGER.error("error", e);
        }
        for (int i = 0; i < count; i++) {
            LOGGER.info("this is {} log", i);
            LOGGER.warn("this is {} warn log", i);
            LOGGER.error("this is {} error log", i);
        }
        return String.valueOf(count);
    }
}
