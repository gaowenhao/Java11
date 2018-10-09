package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3();
        MyThread3 thread2 = new MyThread3();

        thread1.start();
        thread2.start();
    }
}

class MyThread3 extends Thread {          // 搞一个我们的类，实现runnable接口
    public synchronized void run() {      // 加锁保证这段代码被某个线程运行的时候,别的线程不能执行这段代码
        for (var i = 0; i < 100; i++) {
            System.out.print(i + "-");
        }
    }
}
