package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IODemo6 {
    public static void main(String[] args) throws IOException {
        var file = new File("D://a.txt");                       // 创建文件对象
        var in = new FileInputStream(file);
        var bytes = in.readAllBytes();                          // 读取所有字节到数组
        String s = new String(bytes);                           // 使用字节数组构建一个字符串对象
        System.out.println(s);
    }
}
