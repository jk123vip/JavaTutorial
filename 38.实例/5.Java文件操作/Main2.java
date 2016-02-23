/**
 * 获取文件修改时间
 */

import java.io.File;
import java.util.Date;

public class Main2 {

    public static void main(String[] args) {
        File file = new File("Main2.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }

}
