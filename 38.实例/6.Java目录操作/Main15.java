/**
 * 遍历目录
 */

import java.io.*;

public class Main15 {

    public static void main(String[] args) throws Exception {
        System.out.println("遍历目录");
        File dir = new File("/home/jk/Documents");
        visitDirsAndFiles(dir);
    }

    public static void visitDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitDirsAndFiles(new File(dir, children[i]));
            }
        }
    }

}
