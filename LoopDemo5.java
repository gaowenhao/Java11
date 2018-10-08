/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class LoopDemo5 {
    public static void main(String[] args) {
        var x = 1;
        while (true) {        // 这是个无限循环
            if ((x % 2) == 0) {
                continue;
            }
            x++;
            System.out.println(x);
        }
    }
}