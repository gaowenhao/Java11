package advanced.collectiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.LinkedList;

public class CollectionDemo3 {
    public static void main(String[] args) {
        var list = new LinkedList<String>();

        list.add("C++");
        list.addFirst("Dart");
        list.addLast("Golang");

        list.forEach(System.out::print);

        list.removeFirst();
        list.removeLast();
    }
}
