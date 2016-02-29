/**
 * 链表元素查找
 */

import java.util.LinkedList;

public class Main7 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("2");
        System.out.println("元素2第一次出现的位置：" + l.indexOf("2"));
        System.out.println("元素2最后一次出现的位置：" + l.lastIndexOf("2"));
    }
}
