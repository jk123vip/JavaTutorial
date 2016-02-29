/**
 * 获取向量元素的索引值
 */

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println("元素的索引值：" + index);
    }
}
