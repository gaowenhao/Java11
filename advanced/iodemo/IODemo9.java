package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.*;

public class IODemo9 {
    public static void main(String[] args) throws IOException {
        var fileIn = new File("D://a.txt");             // 创建文件对象
        var fileOut = new File("D://b.txt");             // 创建文件对象

        // BufferedInputStream需要一个Inputstream来初始化，还记的FileInputStream是Inputstream的子类么
        var in = new BufferedInputStream(new FileInputStream(fileIn));

        // BufferedOutputStream需要一个Outputstream来初始化，还记得FileOutputStream是Outputstream的子类么
        var out = new BufferedOutputStream(new FileOutputStream(fileOut));

        byte[] buffer = new byte[1024];                                             // 内存中的缓冲区
        int length = -1;
        while ((length = in.read(buffer)) != -1) {
            out.write(buffer, 0, length);
        }

        in.close();
        out.close();
    }
}
