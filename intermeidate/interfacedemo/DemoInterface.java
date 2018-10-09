package intermeidate.interfacedemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public interface DemoInterface {                        // 定义了一个接口

    int x = 10;                                         // 定义了一个接口变量

    void say();                                         // 定义了一个方法，这个方法实际上是abstract的

    default void defaultFunction() {                    // 定义一个默认方法。
        System.out.println("默认方法.");
    }
}

class Demo implements DemoInterface {                  // 通过implements关键字实现一个接口

    public void say() {                                // 当前类必须覆盖掉接口的这个方法
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.say();
        d.defaultFunction();
    }
}