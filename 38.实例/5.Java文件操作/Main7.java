/**
 * 获取文件大小
 */

import java.io.File;

public class Main7 {

    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist!");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) {
        long size = getFileSize("/home/jk/java.txt");
        System.out.println(size);
    }

}
