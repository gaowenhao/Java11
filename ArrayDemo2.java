/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 100};

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        for (int i : array) {             // 增强for循环，这算是一种语法糖,读者应该记住这种用法，比较常用
            System.out.println(i);
        }
    }
}
