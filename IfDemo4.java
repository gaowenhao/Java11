/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class IfDemo4 {
    public static void main(String[] args) {
        var x = 2;

        switch (x) {
            case 2:                          // 如果x是2就执行下面所有的代码
                System.out.println(2);
                break;                       // 如果这里不break则case5内的内容也会被执行
            case 5:
                System.out.println(5);
                break;
        }
    }
}
