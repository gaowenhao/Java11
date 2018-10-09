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

public class IODemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D://a.txt");             // 创建文件对象
        FileOutputStream out = new FileOutputStream(file);       // 把我们的文件对象给outputstream,
        out.write(new byte[]{72, 101, 108, 108, 111});           // Hello，不信去看看Ascii 码表
    }
}
