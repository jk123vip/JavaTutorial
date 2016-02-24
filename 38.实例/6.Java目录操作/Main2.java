/**
 * 删除目录
 */

import java.io.File;

public class Main2 {

    public static void main(String[] args) throws Exception {
        deleteDir(new File("/home/jk/java.txt"));
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        System.out.println("目录已被删除");
        return dir.delete();
    }

}
