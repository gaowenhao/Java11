package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ExceptionDemo6 {
    public static void createFile(String path) throws MyException1, MyException2 {
        if (path.equals("a")) {
            throw new MyException1("测试：我的自定义异常");
        } else {
            throw new MyException2("测试：我的自定义异常");
        }
    }

    public static void main(String[] args) {
        try {
            createFile("D://f.txt");
        } catch (MyException1 e) {
            System.out.println("发生了第一个异常");
        } catch (MyException2 myException2) {
            System.out.println("发生了第二个异常");
        }
    }
}

class MyException1 extends Exception {
    public MyException1(String msg) {
        super(msg);  // 调用父类构造方法，传入消息。
    }
}

class MyException2 extends Exception {
    public MyException2(String msg) {
        super(msg);  // 调用父类构造方法，传入消息。
    }
}
