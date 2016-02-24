/**
 * 在指定目录中查找文件
 */

import java.io.*;

public class Main12 {

    public static void main(String[] args) {
        File dir = new File("/home/jk/Documents");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File file, String name) {
                return name.startsWith("b");
            }
        };
        String[] children = dir.list(filter);
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
