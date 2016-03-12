/**
 * List截取
 */

import java.util.*;

public class Main17 {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List: " + list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表: " + sublist);
        System.out.println("indexOfSublist: " + Collections.indexOfSubList(list, sublist));
        System.out.println("lastIndexOfSublist: " + Collections.lastIndexOfSubList(list, sublist));
    }
}
