/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class LoopDemo4 {
    public static void main(String[] args) {
        var x = 0;
        while (true) {        // 这是个无限循环
            if (x == 10) {    // 如果x == 10
                break;        // 跳出所在的循环
            }
            x++;
            System.out.println("Hello World");
        }
    }
}
