/**
 * List元素替换
 */

import java.util.*;

public class Main16 {
    public static void main(String[] arg) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List: " + list);
        Collections.replaceAll(list, "one", "hundred");
        System.out.println("replaceAll: " + list);
    }
}
