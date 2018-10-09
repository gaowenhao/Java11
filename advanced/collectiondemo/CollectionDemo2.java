package advanced.collectiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args){
        var list = new ArrayList<String>();  // 定义一个ArrayList对象<String>是泛型,指定了这个容器中对象的类型

        list.add("Java");
        list.add("C#");
        list.add("Python");

        Iterator<String> ite = list.iterator();    // 迭代器方法
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
