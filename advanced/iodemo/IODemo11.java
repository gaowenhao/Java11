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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class IODemo11 {
    public static void main(String[] args) throws IOException {
        var file = new File("D://a.txt");                   // 创建文件对象
        var in = new FileInputStream(file);                           // 这个对象还是要有的
        FileChannel channel = in.getChannel();                        // 获取通道
        ByteBuffer buffer = ByteBuffer.allocate(1024);                // 搞一个缓冲区咯为什么要搞呢？因为下面channel要！

        Charset charset = Charset.defaultCharset();                   // 这个负责编码解码的问题
        while (channel.read(buffer) != -1) {                     // 判断是否还有可读内容
            buffer.flip();                                            // 刷缓冲区
            while (buffer.hasRemaining()) {                           // 判断是否还有可读内容
                System.out.println(charset.decode(buffer));
            }
            buffer.clear();                                           // 清空缓冲区
        }

        buffer.clear();
        channel.close();
        in.close();
    }
}
