/**
 * 获取文件的上级目录
 */

import java.io.File;

public class Main7 {

    public static void main(String[] args) {
        File file = new File("/home/jk/test.log");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为:" + strParentDirectory);
    }

}
