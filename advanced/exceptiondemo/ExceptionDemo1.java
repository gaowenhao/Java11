package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ExceptionDemo1 {
    public static int div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println(div(11, 5));
        System.out.println("方法执行完了");
    }
}