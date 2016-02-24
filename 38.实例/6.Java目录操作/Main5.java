/**
 * 获取目录大小
 */

import java.io.File;
import org.apache.commons.io.FileUtils;

public class Main5 {

    public static void main(String[] args) {
        long size = FileUtils.sizeOfDirectory(new File("/home/jk/code/java"));
        System.out.println("Size: " + size + " bytes");
    }

}
