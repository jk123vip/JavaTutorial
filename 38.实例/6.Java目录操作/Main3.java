/**
 * 判断目录是否为空
 */

import java.io.File;

public class Main3 {

    public static void main(String[] args) {
        File file = new File("/home");
        if (file.isDirectory()) {
            String[] files = file.list();
            if (files.length > 0) {
                System.out.println("目录" + file.getPath() + "不为空");
            }
        }
    }

}
