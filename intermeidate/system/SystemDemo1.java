package intermeidate.system;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class SystemDemo1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());                // 获取当前时间距离1970.1.1的毫秒值
        System.gc();                                                   // 手动调用jvm的垃圾回收
        System.out.println(System.getProperty("java.version"));        // 获取Java版本,getProperty可以获得很多属性
        System.exit(0);                                         // 强制终止虚拟机
    }
}
