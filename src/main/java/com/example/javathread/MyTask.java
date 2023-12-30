package com.example.javathread;

// スレッドクラスとタスクを別々に生成する
public class MyTask implements Runnable {
    public final int data;
    public MyTask(int data) {
        this.data = data;
    }
    public void run() {
        System.out.println("[MyTask3] start");
        long total = 0;
        for (long i = 0; i < 1000000000; i++) {
            total += data;
        }
        System.out.println("[MyTask3] end => total = " + total);
    }
}
