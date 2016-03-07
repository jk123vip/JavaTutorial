/**
 * 删除集合中指定元素
 */

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("集合实例:\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "a", str2 = "b", str3 = "c", str4 = "d";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.println("集合数据：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        collection.remove(str2);
        System.out.println("删除[" + str2 + "]之后");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        size = collection.size();
        System.out.println("集合大小：" + size + "\n");
    }
}
