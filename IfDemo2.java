/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class IfDemo2 {
    public static void main(String[] args) {
        var x = 10;
        var y = 20;

        if (x > y) {                         // 如果x 大于 y 则执行代码块内的内容
            System.out.println("x 大于 y");
        }else{                               // 如果上面都不符合则执行这里
            System.out.println("x 不大于 y");
        }
    }
}
