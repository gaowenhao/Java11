/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class FunctionDemo3 {
    public static void main(String[] args) {
        int ret = add(3, 5);            // 定义一个变量接受结果
        System.out.println(ret);              // 输出保存结果的变量

        System.out.println(add(15, 13)); // 也可以不定义变量直接输出结果
    }

    static int add(int x, int y) {           // int表明了这个方法的返回值是int类型
        return x + y;
    }
}
