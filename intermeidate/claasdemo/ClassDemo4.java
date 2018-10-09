package intermeidate.claasdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ClassDemo4 {
    int x = 10;                          // 定义一个类变量
    void say(){                          // 定义一个类方法
        System.out.println(this.x);      // 对象内访问其他成员需要使用this，这里的this相当于下面的p，他是当前对象的引用。
    }
}

class Main2{
    public static void main(String[] args){
        ClassDemo4 p = new ClassDemo4();
        System.out.println(p.x);      //正常的外部访问
    }
}
