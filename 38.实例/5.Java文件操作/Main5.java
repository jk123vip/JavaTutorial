/**
 * 设置文件只读
 */

import java.io.File;

public class Main5 {

    public static void main(String[] args) {
        File file = new File("/home/jk/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }

}
