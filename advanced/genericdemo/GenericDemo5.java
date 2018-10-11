package advanced.genericdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class GenericDemo5 {
    public static void main(String[] args) throws Exception {
        MyType5 type = new MyType5();
        type.say(GenericDemo5.class);
    }
}

class MyType5 {
    public <E> E say(Class<E> clazz) throws Exception {
        return clazz.getDeclaredConstructor().newInstance();
    }
}