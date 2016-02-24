/**
 * 获取目录最后修改时间
 */

import java.io.File;
import java.util.Date;

public class Main8 {

    public static void main(String[] args) {
        File file = new File("/home/jk/test.log");
        System.out.println("最后修改时间: " + new Date(file.lastModified()));
    }

}
