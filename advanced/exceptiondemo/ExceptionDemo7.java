package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ExceptionDemo7 {
    public static void main(String[] args) {
        try{
            int x = 1 / 0;
        }finally {                            // 可以有catch，也可以没有。
            System.out.print("我一定会被执行");
        }
    }
}
