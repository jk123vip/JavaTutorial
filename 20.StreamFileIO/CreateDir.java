/** 创建目录 */

import java.io.File;

public class CreateDir {

    public static void main(String[] args) {

        String dirname = "/home/jk/new";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdir();

    }
}
