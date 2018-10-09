package intermeidate.mutiple2;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import intermeidate.mutiple1.PackageDemo1;                // 由于不同包，必须要使用import导入

public class PackageDemo3 {
    public static void main(String[] args) {
        PackageDemo1 demo1 = new PackageDemo1();          // 调用不同包类
        PackageDemo2 demo2 = new PackageDemo2();          // 同包不同文件的类
        PackageDemo3 demo3 = new PackageDemo3();          // 当前文件的类
    }
}
