package advanced.collectiondemo;
import java.util.ArrayList;

/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class CollectionDemo1 {
    public static void main(String[] args){

        var list = new ArrayList<String>();  // 定义一个ArrayList对象<String>是泛型,指定了这个容器中对象的类型

        list.add("Java");
        list.add("C#");
        list.add("Python");
        System.out.println(list.get(0));    // 获取第0个元素："Java"
    }
}
