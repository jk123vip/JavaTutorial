/**
 * 修改文件最后的修改日期
 */

import java.io.File;
import java.util.Date;

public class Main8 {

    public static void main(String[] args) throws Exception {
        File fileToChange = new File("/home/jk/myjavafile.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }

}
