package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class IODemo12 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D://c.txt");                            // 通过Paths构造一个文件
        boolean exists = Files.exists(path);                           // Fils有很多静态方法辅助操作文件
        Files.createFile(path);                                        // 创建一个文件

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE);     // 通过path 打开一个通道
        ByteBuffer buffer = ByteBuffer.allocate(1024);                                  // buffer缓冲区
        // 把字符串写进去,但是这个方法只接受字节数组所以要想将字符串转字节数组,getBytes()方法可以帮助我们
        buffer.put("高文豪的博客:gaowenhao.cn".getBytes());

        buffer.flip();                                                                 // 刷流

        fileChannel.write(buffer);                                                     // 写入

        fileChannel.close();
        buffer.clear();
    }
}
