package advanced.genericdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class GenericDemo3 {
    public static void main(String[] args) {
        var t = new MyType2<Object>("abc");
        t.say("这里同样只接受string类型.");
    }
}


class MyType3<T> {
    private T str;   // 也可以根据泛型定义成员变量

    public void say(T t) {
        System.out.print(t);
    }
}