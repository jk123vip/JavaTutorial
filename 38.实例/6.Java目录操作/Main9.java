/**
 * 打印目录结构
 */

import java.io.File;
import java.io.IOException;

public class Main9 {

    public static void main(String[] args) throws Exception {
        showDir(1, new File("/home/jk/Documents"));
    }

    static void showDir(int indent, File file) throws Exception {
        for (int i = 0; i < indent; i ++) {
            System.out.print('-');
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                showDir(indent + 4, files[i]);
            }
        }
    }

}
