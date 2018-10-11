package advanced.genericdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class GenericDemo6 {
    public static void main(String args[]) {
        // Plate<? extends Fruit> p = new Plate<Apple>(new Apple());      // 这句代码错误的,前后泛型不匹配
        // Plate<? super Fruit> p = new Plate<Apple>(new Apple());      // 下届通配符
        Plate<? extends Fruit> p = new Plate<Apple>(new Apple());      // 上届通配符
    }

}

class Fruit {
}

class Apple extends Fruit {
}

class Plate<T> {
    private T item;

    public Plate(T t) {
        item = t;
    }

    public void set(T t) {
        item = t;
    }

    public T get() {
        return item;
    }
}