package advanced.annotationdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation(id = 15, name = "葫芦娃")
public class AnnotationDemo2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface MyAnnotation {
    int id();                                            // 定义一个int属性

    String name() default "默认名字";                    // 定义一个name属性，设置name的默认值
}
