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

public class IODemo7 {
    public static void main(String[] args) throws IOException {
        var fileIn = new File("D://a.txt");             // 创建文件对象
        var fileOut = new File("D://b.txt");             // 创建文件对象
        var in = new FileInputStream(fileIn);
        var out = new FileOutputStream(fileOut);

        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        in.close();
        out.close();
    }
}
