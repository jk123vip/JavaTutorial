/**
 * List与Set类型集合的遍历
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        // List集合的遍历
        listTest();
        // Set集合的遍历
        setTest();
    }

    public static void setTest() {
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        // 重复数据添加失败
        set.add("JAVA");
        set.add("JAVASCRIPT");

        // 使用iterator遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用增强for循环遍历set集合
        for (String s : set) {
            System.out.println(s);
        }
    }

    // 遍历list集合
    public static void listTest() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("efghijklmn");

        // 使用iterator遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用传统for循环遍历
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        // 使用增强for循环遍历
        for (String s : list) {
            System.out.println(s);
        }
    }

}
