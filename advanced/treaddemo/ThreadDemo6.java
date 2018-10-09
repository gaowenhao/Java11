package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo6 {
    public static void main(String[] args) {
        MyThread6 thread1 = new MyThread6();
        MyThread6 thread2 = new MyThread6();

        thread1.start();
        thread2.start();
    }
}

class MyThread6 extends Thread {     // 搞一个我们的类，实现runnable接口
    private final Lock lock = new ReentrantLock();

    public void run() {             // 需要运行的内容,加锁,保证这段代码被某个线程运行的时候,这个线程会一直运行完毕别的线程才能运行
        lock.lock();                // 获取锁

        try {
            for (var i = 0; i < 100; i++) {
                System.out.print(i + "-");
            }
        } finally {
            lock.unlock();          // 释放锁
        }
    }
}
