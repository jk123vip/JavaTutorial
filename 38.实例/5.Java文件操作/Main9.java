/**
 * 创建临时文件
 */

import java.io.*;

public class Main9 {

    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("pattern", ".suffix");
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已经创建:");
        out.close();
    }

}
