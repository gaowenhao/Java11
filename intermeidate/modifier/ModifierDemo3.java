package intermeidate.modifier;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public abstract class ModifierDemo3 {  // 定义一个抽象类
    abstract public void say();        // 定义一个抽象方法，注意这里没有方法体。
}

class Child extends ModifierDemo3{     // 继承这个抽象类

    public void say() {                // 实现抽象方法,如果不实现抽象方法又想继承,那么就只能讲Child也声明为abstract
    }
}
