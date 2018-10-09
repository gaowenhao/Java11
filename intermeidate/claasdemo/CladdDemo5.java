package intermeidate.claasdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class CladdDemo5 {
    int x = 10;                                 //定义一个类变量
    void say(){                                 //定义一个类方法
        System.out.println("Hello!");
    }
}
class Child extends CladdDemo5{                // 继承Parent类则一定程度上具有父类所有可继承的方法

}

class Main3{
    public static void main(String[] args){
        Child c = new Child();                 // 创建Child对象
        c.say();                               // 子类会继承父类的方法.
    }
}