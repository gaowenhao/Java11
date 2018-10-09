package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo4 {
    public static void main(String[] args) throws IOException {
        var file = new File("D://a.txt");             // 创建文件对象
        var fw = new FileWriter(file);
        fw.write("高文豪的博客:gaowenhao.cn");
        fw.flush();                                             // 记得刷新流
        fw.close();                                             // 释放资源好习惯
    }
}
