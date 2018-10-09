package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ExceptionDemo2 {
    public static int div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        try {                                               // 我们猜测try代码块内的内容可能有异常
            System.out.print(div(11, 0));
        } catch (ArithmeticException e) {                   // 如果抓到的异常是ArithmeticException,则我们不停止程序运行可以继续执行
            System.out.print("我们获取抓到了一个异常" + e);
        }
        System.out.println("方法执行完了");
    }
}
