package com.example.javathread;

// Thread を表すクラスを作成する
public class MyThread extends Thread {
    private final int data;
    public MyThread(int data) {
        this.data = data;
    }

    // タスクをスレッドクラス自体に直接記述する形式
    // runメソッドでは引数を取れないのでフィールドを用意してコンストラクタで設定する
    @Override
    public void run() {
        System.out.println("[MyThread] start");
        long total = 0;
        for (long i = 0; i < 1000000000; i++) {
            total += data;
        }
        System.out.println("[MyThread] end => total = " + total);
    }
}
