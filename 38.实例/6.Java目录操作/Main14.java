/**
 * 查看当前工作目录
 */

import java.io.*;

public class Main14 {

    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为：" + curDir);
    }

}
