package advanced.enumdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getState());                // 获取状态
        if (Thread.currentThread().getState() == Thread.State.RUNNABLE) {   // 判断状态
            System.out.println("当前线程正处于Runnable");
        }
    }
}
