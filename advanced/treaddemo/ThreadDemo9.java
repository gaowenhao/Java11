package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo9 {
    public static void main(String[] args) throws InterruptedException {
        var lock = new Object();

        MyThread9 thread0 = new MyThread9(lock, "thread0");
        MyThread9 thread1 = new MyThread9(lock, "thread1");

        thread0.start();
        thread1.start();

        new Thread(() -> {
            try {
                System.out.println("唤醒将在2.5秒后开启!");
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                lock.notifyAll();                         // 去唤醒所有的wait
            }
        }).start();
    }
}

class MyThread9 extends Thread {
    private Object lock;

    MyThread9(Object lock, String name) {
        super(name);
        this.lock = lock;
    }

    public synchronized void run() {
        synchronized (lock) {                       // 所住当前代码块不让别的线程进来
            try {
                System.out.println(Thread.currentThread().getName() + "开启了");
                Thread.sleep(1000);           // 先睡个1秒钟，但是这里的sleep并不会释放锁
                lock.wait();                        // 进入无限制等待状态,并且释放锁
                System.out.println(Thread.currentThread().getName() + "wait结束!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
