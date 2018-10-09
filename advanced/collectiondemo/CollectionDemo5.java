package advanced.collectiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.TreeMap;

public class CollectionDemo5 {
    public static void main(String[] args) {
        var map = new TreeMap<String, Integer>();
        map.put("d", 16);
        map.put("b", 10);
        map.put("c", 12);
        map.put("a", 18);

        System.out.print(map);
    }
}
