/**
 * 读取文件内容
 */

import java.io.*;

public class Main13 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/home/jk/test.log"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
