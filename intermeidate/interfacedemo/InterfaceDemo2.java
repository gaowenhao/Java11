package intermeidate.interfacedemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class InterfaceDemo2 {
    public static void main(String[] args) {
        InterfaceDemo2 ad = new InterfaceDemo2() {   // 实现一个匿名内部类,诸如一个临时类实现,内容是空的.
        };

        InterfaceDemo id = new InterfaceDemo() {     // 实现一个匿名内部类
            public void say() {                      // 覆盖了存在的抽象方法(还记得接口中的方法都是public abstract的么)
            }
        };
    }
}

interface InterfaceDemo {
    void say();
}
