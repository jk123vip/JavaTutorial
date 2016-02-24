/**
 * 递归创建目录
 */

import java.io.File;

public class Main1 {

    public static void main(String[] args) {
        String directories = "/home/jk/testjava/a/b/c";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }

}
