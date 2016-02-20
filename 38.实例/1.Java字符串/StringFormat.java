/**
 * 字符串格式化
 */

import java.util.*;

public class StringFormat {

    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.GERMANY, "%-10.4f%n%n", e); //指定本地为德国
    }

}
