package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IODemo5 {
    public static void main(String[] args) throws IOException {
        var file = new File("D://a.txt");             // 创建文件对象
        var reader = new FileReader(file);

        int b;

        while (true) {
            b = reader.read();               // 读入一个字符,还记得Java中char占几个字节么？
            if (b == -1) {                   // 如果是-1，则意味着读到结尾
                break;
            } else {
                System.out.print((char) b);  // 将其转为字符
            }
        }
    }
}
