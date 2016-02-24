/**
 * 删除文件
 */

import java.io.*;

public class Main12 {

    public static void main(String[] args) {
        try {
            File file = new File("/home/jk/test.txt");
            if (file.delete()) {
                System.out.println(file.getName() + "文件以被删除");
            } else {
                System.out.println("文件删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
