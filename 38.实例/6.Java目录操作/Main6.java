/**
 * 在指定目录中查找文件
 */

import java.io.File;

public class Main6 {

    public static void main(String[] args) throws Exception {
        File dir = new File("./");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

}
