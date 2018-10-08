/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class BasicEnd {
    public static void main(String[] args) {
        say(100);
    }

    static void say(int length) {                // 定义方法, 接受参数,方法需要为static,因为上一章说过main方法只能调用static方法。
        int array[] = new int[length];           // 初始化对应长度的数组
        for (int i = 0; i < length; i++) {
            array[i] = i + 5;
        }
        var doubleValCount = 0;
        for (int val : array) {
            if (val % 2 == 1) {                  // 判断是否为单数
                System.out.println(val);
            } else {
                doubleValCount += 1;            // 遇到一个双数
                if (doubleValCount % 3 == 0) {  //判断当前是否是第三个双数.
                    System.out.println(val);
                }
            }
        }
    }
}
