package advanced.collectiondemo;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionDemo4 {
    public static void main(String[] args) {
        var ageMap = new HashMap<String, Integer>();      // 这里的Integer是int的官方对象
        ageMap.put("张三", 21);
        ageMap.put("李四", 28);

        System.out.println(ageMap.get("张三"));     // 获取张三的年龄
        System.out.println(ageMap.keySet());        // 获取所有的key
        System.out.println(ageMap.values());        // 获取所有的value


        for (String s : ageMap.keySet()) {                                  // 获取所有的key
            System.out.println(s + "-" + ageMap.get(s));
        }

        for (Map.Entry<String, Integer> kv : ageMap.entrySet()) {           // 获取所有的键值对
            System.out.println(kv.getKey() + " - " + kv.getValue());
        }

        Iterator<Map.Entry<String, Integer>> it = ageMap.entrySet().iterator();          // 迭代器方式
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        ageMap.forEach((k, v) -> {                                          // lambda 方式
            System.out.println(k + "-" + v);
        });
    }
}
