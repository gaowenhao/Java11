package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.*;

public class IODemo10 {
    public static void main(String[] args) throws IOException {
        var fileIn = new File("D://a.txt");             // 创建文件对象
        var fileOut = new File("D://b.txt");             // 创建文件对象

        var reader = new BufferedReader(new FileReader(fileIn));   // BufferedReader需要一个Reader进行包装
        var writer = new BufferedWriter(new FileWriter(fileOut));  // BufferedWriter需要一个Writer进行包装

        var line = reader.readLine();                              // 读一行，这个方法是BufferedReader特有的很方便
        writer.write(line);

        reader.close();
        writer.close();
    }
}
