package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();                               // 开启第一个线程
        thread2.start();                               // 开启第二个线程
    }
}

class MyThread extends Thread {                        // 搞一个我们的类，继承Thread接口
    public void run() {                                // 需要运行的内容
        for (var i = 0; i < 100; i++) {
            System.out.print(i + "-");
        }
    }
}