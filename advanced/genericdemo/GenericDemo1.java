package advanced.genericdemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class GenericDemo1 {
    public static void Main(String args[]) {
        var t = new MyType<String, Integer, Float, Boolean>();
    }
}

class MyType<T, E, Z, F> {

}
