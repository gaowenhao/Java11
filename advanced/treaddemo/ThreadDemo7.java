package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo7 {
    public static void main(String[] args) {
        MyThread7 thread1 = new MyThread7();
        MyThread7 thread2 = new MyThread7();

        thread1.start();
        thread2.start();
    }
}

class MyThread7 extends Thread {
    public void run() {
        try {                              // 这里必须处理掉这个异常,因为子类覆盖父类的方法不能抛出父类没有抛出的异常
            Thread.sleep(1000);            // 调用Thread类的静态方法sleep可以使当前线程进入等待，进入一个有限期等待。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("睡了1秒钟我终于执行了！");
    }
}
