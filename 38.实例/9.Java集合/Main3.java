/**
 * 集合打乱顺序
 */

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }
        System.out.println("打乱前：");
        System.out.println(list);

        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次打乱:");
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}
