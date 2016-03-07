/**
 * 数组转集合
 */

import java.util.Arrays;
import java.util.*;
import java.io.*;

public class ArrayToCollection {
    public static void main(String[] args) throws IOException {
        int n = 5; // 5个元素
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = String.valueOf(i);
        }
        List<String> list = new Arrays.asList(name);
        System.out.println();
        for (String li : list) {
            String str = li;
            System.out.println(str + " ");
        }
    }
}
