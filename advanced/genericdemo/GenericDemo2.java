package advanced.genericdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class GenericDemo2 {
    public static void main(String[] args) {
        var t = new MyType2<String>("abc");
        t.say("这里同样只接受string类型.");
    }
}


class MyType2<T> {
    private T str;   // 也可以根据泛型定义成员变量

    MyType2(T t) {   // 这个构造方法必须传入泛型对应的类型

    }

    public void say(T t) {
        System.out.print(t);
    }
}