package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.*;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        // try 中开启流,我们就不需要使用finally释放这个流了
        try (FileInputStream inputStream = new FileInputStream(new File("test"))) {
            System.out.println(inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}