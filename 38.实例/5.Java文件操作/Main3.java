/**
 * 在指定目录中创建文件
 */

import java.io.File;

public class Main3 {

    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("/home/jk/");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }

}
