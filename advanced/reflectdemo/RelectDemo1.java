package advanced.reflectdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = Class.forName("advance.HelloWorld");                        // 这里必须是类全名(带包)
        Method[] methods = clazz.getMethods();                                       // 获取所有的方法
        for (Method method : methods) {                                              // 遍历方法
            System.out.println(method.getName());                                    // 依次打印所有的方法名
        }

        HelloWorld hw = (HelloWorld) clazz.getDeclaredConstructor().newInstance();   // 获取默认的构造函数创建一个实例
        hw.say();                                                                    // 调用say方法！
    }
}
