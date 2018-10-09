package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.File;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {           // 暂时不要理会throws这个东西
        File file = new File("D://a.txt");                      // 创建一个文件，这是一个Windows文件路径
        System.out.println(file.exists());                      // 判断文件是否存在, false
        file.createNewFile();                                   // 创建这个文件
        System.out.println(file.exists());                      // 判断文件是否存在, true
        System.out.println(file.getName());                     // 获取文件名称     a.txt
        System.out.println(file.length());                      // 获取文件大小(字节单位)     0
    }
}
