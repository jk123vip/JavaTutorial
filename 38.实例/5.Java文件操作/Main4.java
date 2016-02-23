/**
 * 检测文件是否存在
 */

import java.io.File;

public class Main4 {

    public static void main(String[] args) {
        File file = new File("/home/jk/java.txt");
        System.out.println(file.exists());
    }

}
