package advanced.exceptiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionDemo3 {
    public static void createFile(String path) throws IOException {
        Path filePath = Paths.get(path);
        Files.createFile(filePath);
    }

    public static void main(String[] args) throws IOException {
        createFile("D://f.txt");
    }
}
