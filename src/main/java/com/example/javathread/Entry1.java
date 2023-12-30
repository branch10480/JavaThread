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

        // Thread を表すクラスを作成する
        MyThread thread1 = new MyThread(3);
        MyThread thread2 = new MyThread(10);
        System.out.println("[main] start");
        thread1.start();
        thread2.start();

        // スレッドとタスクを別々に扱う方法
        Runnable task1 = new MyTask(3);
        Thread thread3 = new Thread(task1);
        thread3.start();

        // 匿名クラスでも可能（ラムダを使用）
        Thread thread4 = new Thread(() -> {
            System.out.println("[MyTask4] start");
            long total = 0;
            for (long i = 0; i < 1000000000; i++) {
                total += 10;
            }
            System.out.println("[MyTask4] end => total = " + total);
        });
        thread4.start();

        System.out.println("[main] end");
    }
}

