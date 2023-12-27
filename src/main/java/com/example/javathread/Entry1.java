package com.example.javathread;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Entry1 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is Entry1.");
        System.out.println("--------------------");

        for (String arg : args.getSourceArgs()) {
            System.out.println(arg);
        }
    }
}
