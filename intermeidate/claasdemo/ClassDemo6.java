package intermeidate.claasdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ClassDemo6 {
    void say() {                                         //定义一个类方法
        System.out.println("Parent Hello!");
    }
}

class Child2 extends ClassDemo6 {
    void say() {                                       // 重新定义父类的方法
        super.say();                                   // 通过super关键字可以调用父类的方法
        System.out.println("Child Hello!");
    }
}