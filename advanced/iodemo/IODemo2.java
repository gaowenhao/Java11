package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D://a.txt");             // 创建文件对象
        FileOutputStream out = new FileOutputStream(file);       // 把我们的文件对象给outputstream, 而outpustream对象会帮助我们创建一个不存在的文件
        out.write(97);                                       // 写入一个字节,这个字节的十进制是97,几乎所有的码表都向下兼容ascii 这意味着97在文件中是字符 'a'
        out.close();                                             // 必须要关流
    }
}
