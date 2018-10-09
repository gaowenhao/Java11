package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ExceptionDemo5 {
    public static void createFile(String path) throws MyException {
        throw new MyException("测试：我的自定义异常");
    }

    public static void main(String[] args) throws MyException {
        createFile("D://f.txt");
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);  // 调用父类构造方法，传入消息。
    }
}
