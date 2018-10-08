/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class IfDemo3 {
    public static void main(String[] args) {
        var x = 10;
        var y = 20;
        if (x > y) {                      // 如果x 大于 y 则执行代码块的内容，并且跳过后面一个体系内的else if 以及 else
            System.out.println("x大于y");
        } else if (x < y) {               // 如果符合这个条件则执行代码块内容，并跳下面所有同体系的else 和 if
            System.out.println("x小于y");
        } else {                          // 如果上面都不符合，则执行这个逻辑
            System.out.println("x小于y");
        }
    }
}