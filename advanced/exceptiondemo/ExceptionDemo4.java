package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ExceptionDemo4 {
    public static void createFile(String path) throws FileAlreadyExistsException {
        throw new FileAlreadyExistsException("测试：文件已经存在了！");
    }

    public static void main(String[] args) throws IOException {
        createFile("D://f.txt");
    }
}
