package advanced.genericdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.ArrayList;

public class GenericDemo4 {
    public static void main(String[] args) {
        MyType4 type = new MyType4();
        type.say();
    }
}

class MyType4<T> {
    T say() {
        return (T) new String("abc");
    }
}