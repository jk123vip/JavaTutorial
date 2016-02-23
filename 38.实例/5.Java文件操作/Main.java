/**
 * 文件路径比较
 */

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("/home/jk/demo1.txt");
        File file2 = new File("/home/jk/demo2.txt");
        if (file1.compareTo(file2) == 0) {
            System.out.println("路径一致");
        } else {
            System.out.println("路径不一致");
        }
    }

}
