package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 thread = new MyThread2();

        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);

        t1.start();
        t2.start();
    }
}

class MyThread2 implements Runnable {          // 搞一个我们的类，实现runnable接口

    public void run() {                       // 需要运行的内容
        for (var i = 0; i < 100; i++) {
            System.out.print(i + "-");
        }
    }
}
