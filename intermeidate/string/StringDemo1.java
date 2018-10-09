package intermeidate.string;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class StringDemo1 {
    public static void main(String[] args) {
        String s = new String("Hello World");
        String ss = "也可以这样初始化一个String对象";

        System.out.println(s.length());                   // 获取这个字符串的长度  11
        System.out.println(s.equals("Hello World"));      // 判断是否和Hello World 相同
        System.out.println(s.startsWith("He"));           // 判断是否以He开头     true
        System.out.println("zxxx");                       // 判断是否以zxxx结尾   false
        System.out.println(s.charAt(2));                  // 获取下标为2的字符,从0开始    l
    }
}
