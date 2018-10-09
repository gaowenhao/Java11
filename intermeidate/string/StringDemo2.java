package intermeidate.string;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();             // 创建这个对象
        sb.append("ab");                                    // 添加一个字符串在结尾
        sb.insert(1, "aadde");                   // 从指定坐标添加一个字符串
        sb.append(10);                                      // 添加一个整型
        System.out.print(sb.toString());                    // 输出String
    }
}
