/**
 * 删除链表中的元素
 */

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("1");
        l.add("8");
        l.add("6");
        l.add("4");
        l.add("5");
        System.out.println(l);
        l.subList(2, 4).clear();
        System.out.println(l);
    }
}
