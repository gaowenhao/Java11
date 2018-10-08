/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array;                       // 声明int类型的数组

        int array2[];                      //实际上也可以这么声明，推荐前一种方式.

        int[] arrayInit = new int[5];      // new 是Java的一个关键字初始化一个数组,长度为5.当一个int数组初始化后,数组内的值会被默认设置为0.

        arrayInit[0] = 10;                 // 为数组下标为0的位设值为10,数组的第一个下标是0.

        arrayInit[3] = 15;                 // 为数组第下标位3的位设值为15

        float[] arrayFloat = {1.0f, 3.5f}; //定义，初始化，并且赋值一个float数组,长度为2.

        System.out.println(arrayFloat[0]); // 数组的取值方式从0开始，这里取第0个就是1.0
    }
}
