package advanced.treaddemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ThreadDemo3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {                          // 给Thread 传入匿名内部类
            public void run() {
                for (var i = 0; i < 100; i++) {
                    System.out.print(i + "-");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {                          // 给Thread传入匿名内部类
            public void run() {
                for (var i = 0; i < 100; i++) {
                    System.out.print(i + "-");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
