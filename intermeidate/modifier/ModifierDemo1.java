package intermeidate.modifier;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class ModifierDemo1 {
    int y = 20; // 非静态变量

    static int x = 10;
    static void say() {  // 静态方法
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ModifierDemo1 p = new ModifierDemo1();
        ModifierDemo1 p1 = new ModifierDemo1();

        p.y = 100;
        System.out.println(p.y);   // 100
        System.out.println(p1.y);  // 20

        p.x = 100;
        System.out.println(p.x);   // 100
        System.out.println(p1.x);  // 100
    }
}
