package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo8 {
    public static void main(String[] args) {
        MyThread8 thread1 = new MyThread8();
        MyThread8 thread2 = new MyThread8();

        thread1.start();
        thread2.start();
    }
}

class MyThread8 extends Thread {
    public synchronized void run() {       // wait方法必须再同步代码块内,不然运行时会抛出一个异常
        try {                              // 这里必须处理掉这个异常,因为子类覆盖父类的方法不能抛出父类没有抛出的异常
            wait(1000);                    // wait方法是Object的方法，所以可以直接调用，这里也是进入一个有限期等待中
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("睡了1秒钟我终于执行了！");
    }
}
