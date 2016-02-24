/**
 * 遍历指定目录下的所有文件
 */

import java.io.*;

public class Main11 {

    public static void main(String[] args) {
        File dir = new File("/home/jk/Documents");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("目录不存在或他不是一个目录");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

}
