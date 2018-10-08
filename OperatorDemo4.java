/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class OperatorDemo4 {
    public static void main(String[] args) {
        var x = true;
        var y = false;
        var z = true;

        System.out.println(x && y);       // && 翻译为中文即:和, 这里相当于问x 和 y都是true么？结果是否定的，因为y是false
        System.out.println(x || y);      // ||翻译为中文即是:或，这里相当于问x 或 y是true么？结果是肯定的，因为x是true
        System.out.println(!z);          // !是取反,z原值是true取反则为false.
        System.out.println(x & y);       // & 翻译为中文也是和（实际上很多人会将这个东西和逻辑运算区别来讲，我这里就一起了）。


        var a = 10;
        var b = 20;
        var c = (a + 1) == 10 && (b / 0) == 30;
        /*
            翻译成中文：a + 1==10 和 (b / 0) == 30是否都为真，如果用&&这里则会返回false，
            因为当他发现第一个表达式为假的时候，那么他就不会执行后面的了，因为后面无论是什么这个表达式都为假，但是&则不同。
        */


        /*
            var c2 = (a + 1) == 10 & (b / 0) == 30;
            这会报错，因为&不论前面的表达式是否成立，都会执行后面的表达式，当执行(b / 0) == 30的时候，
            这里犯了一个很明显的错误就是0做除数了，在数学里0不能做除数，这个定理在编程里一样通用。
         */
    }
}
