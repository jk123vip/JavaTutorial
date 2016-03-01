/**
 * 旋转向量
 */

import java.util.Collections;
import java.util.Vector;

public class Main11 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        Collections.swap(v, 0, 3);
        System.out.println("旋转后");
        System.out.println(v);
    }
}
