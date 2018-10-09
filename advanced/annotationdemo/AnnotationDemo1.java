package advanced.annotationdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class AnnotationDemo1 {
    @MyAnnotation                                  // 使用一个注解
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    @interface MyAnnotation {                      // 定义一个注解
    }
}
