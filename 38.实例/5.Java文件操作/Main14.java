/**
 * 文件写入
 */

import java.io.*;

public class Main14 {

    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
            out.write("abcdefg");
            out.close();
            System.out.println("Create File Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
