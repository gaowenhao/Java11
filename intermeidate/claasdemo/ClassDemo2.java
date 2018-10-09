package intermeidate.claasdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ClassDemo2 {
    int x = 10;                               //定义一个类变量
    void say(){                               //定义一个类方法
        System.out.println("Hello!");
    }
}

class Main{
    public static void main(String[] args){
        ClassDemo2 p = new ClassDemo2();      // 通过new 关键字产生一个Person对象
        p.say();                              // 调用p的say方法
        p.x = 20;                             // 设置这个对象的x参数
        System.out.println(p.x);              // 调用p的x属性
    }
}
