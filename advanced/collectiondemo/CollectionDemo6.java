package advanced.collectiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.TreeSet;

public class CollectionDemo6 {
    public static void main(String[] args) {
        var set = new TreeSet<Integer>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);
        System.out.print(set);                 // [1,2,3,4] tree set会将内容排序好
    }
}
