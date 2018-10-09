package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo5 {
    public static void main(String[] args) {
        MyThread4 thread1 = new MyThread4();
        MyThread4 thread2 = new MyThread4();

        thread1.start();
        thread2.start();
    }
}

class MyThread4 extends Thread {          // 搞一个我们的类，实现runnable接口
    public void run() {                   // 加锁保证这段代码被某个线程运行的时候,别的线程不能执行这段代码
        synchronized (this) {             // 锁标记是当前对象,这个锁标记可以是任何对象类型
            for (var i = 0; i < 100; i++) {
                System.out.print(i + "-");
            }
        }
    }
}
