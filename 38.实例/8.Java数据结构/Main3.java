/**
 * 获取链表的第一个和最后一个元素
 */

import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("100");
        l.add("200");
        l.add("300");
        l.add("400");
        l.add("500");
        System.out.println("The first element is: " + l.getFirst());
        System.out.println("The last element is: " + l.getLast());
    }
}
