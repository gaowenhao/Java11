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
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo8 {
    public static void main(String[] args) throws IOException {
        var fileIn = new File("D://a.txt");             // 创建文件对象
        var fileOut = new File("D://b.txt");             // 创建文件对象
        var in = new FileInputStream(fileIn);
        var out = new FileOutputStream(fileOut);

        var b = new byte[2048];                                   // 定义缓冲区
        int length;                                               // 定义长度
        while ((length = in.read(b)) != -1) {                     // 读内容到b字节数组,将读到内容的长度返回给length
            out.write(b, 0, length);                          // 写出文件
        }

        in.close();
        out.close();
    }
}
