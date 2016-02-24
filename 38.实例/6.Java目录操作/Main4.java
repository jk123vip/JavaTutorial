/**
 * 判断文件是否隐藏
 */

import java.io.File;

public class Main4 {

    public static void main(String[] args) {
        File file = new File("/home/test.log");
        System.out.println(file.isHidden());
    }

}
