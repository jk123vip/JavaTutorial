/** 从控制台读取多字符输入 */

import java.io.*;

public class BRRead {

    public static void main(String[] args) throws IOException {

        char c;
        // 使用System.in创建BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

    }
}
