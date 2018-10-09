package advanced.iodemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class IODemo13 {
    public static void main(String[] args) throws IOException {
        var filea = Paths.get("D://a.txt");                            // 通过Paths构造一个文件
        var filed = Paths.get("D://d.txt");                            // 通过Paths构造一个文件

        var channela = FileChannel.open(filea, StandardOpenOption.READ);    // 通道1,使用读权限
        var channelb = FileChannel.open(filed, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW); // 通道2使用写和创建权限

        channelb.transferFrom(channela, 0, channela.size());

        channela.close();
        channelb.close();
    }
}
