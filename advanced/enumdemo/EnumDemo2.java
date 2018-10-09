package advanced.enumdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class EnumDemo2 {
    public static void main(String[] args) {
        System.out.print(MyEnum.RED);                          // RED
        System.out.print(MyEnum.RED.ordinal());                // 真实的值 0，从0开始ORANGE 是1，YELLOW是2。。。
    }
}

enum MyEnum {
    RED, ORANGE, YELLOW, GREEN, CYAN, BLUE, PURPLE
}
