/**
 * 文件重命名
 */

import java.io.File;

public class Main6 {

    public static void main(String[] args) {
        File oldName = new File("/home/jk/program.txt");
        File newName = new File("/home/jk/java.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }

}
