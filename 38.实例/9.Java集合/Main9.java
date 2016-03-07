/**
 * 集合输出
 */

import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("TreeMap实例！\n");
        TreeMap tMap = new TreeMap();
        tMap.put(1, "a");
        tMap.put(2, "b");
        tMap.put(3, "c");
        tMap.put(4, "d");
        tMap.put(5, "e");
        tMap.put(6, "f");
        tMap.put(7, "g");
        System.out.println("TreeMap键：" + tMap.keySet());
        System.out.println("TreeMap值：" + tMap.values());
        System.out.println("键为5的值：" + tMap.get(5) + "\n");
        System.out.println("第一个键：" + tMap.firstKey()
                + " Value: " + tMap.get(tMap.firstKey()) + "\n");
        System.out.println("最后一个键：" + tMap.lastKey() + " Value: "
                + tMap.get(tMap.lastKey()) + "\n");
        System.out.println("移除第一个数据：" + tMap.remove(tMap.firstKey()));
        System.out.println("现在TreeMap键为：" + tMap.keySet());
        System.out.println("现在TreeMap包含：" + tMap.values());
        System.out.println("移除最后一个数据：" + tMap.remove(tMap.lastKey()));
        System.out.println("现在键：" + tMap.keySet());
        System.out.println("现在值：" + tMap.values());
    }
}

