/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class OperatorDemo1 {
    public static void main(String[] args) {
        var a = 3 + 2;          // a = 5
        var b = 3 - 2;          // b = 1
        var c = 3 * 2;          // c = 6
        var d = 3 / 2;          // d = 1, Java中两个整形(3,2默认是整形)相除,则一定会得出一个整形,正常结果3 / 2应该是1.5，而1.5取整则为1.
        var e = 3 % 2;          // e = 1 这个操作是模运算,说白了就是取余数,3/2余1
        var v = 10;             // v = 10
        v++;                    // v = 11 使得变量值增1
        v--;                    // v = 10 使得变量值减1

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        System.out.print(v);    // 10
    }
}
