/**
 * 查找List中的最大最小值
 */

import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five Six one Three four".split(" "));
        System.out.println(list);
        System.out.println("最大值：" + Collections.max(list));
        System.out.println("最小值：" + Collections.min(list));
    }
}
