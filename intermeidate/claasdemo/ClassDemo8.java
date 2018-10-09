package intermeidate.claasdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ClassDemo8 {
    void say() {                                   // 定义say方法
        System.out.println("Hello World");
    }
}

class Child3 extends ClassDemo8{
    void say() {                                   // 子类定义
        System.out.println("Child Say");
    }

    public static void main(String[] args) {
        ClassDemo8 p = new Child3();              // 父类的引用指向子类的对象
        p.say();                                  //调用的方法实际上是子类的
    }
}