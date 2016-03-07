/**
 * HashMap遍历
 */

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("1", "1st");
        h.put("2", "2nd");
        h.put("3", "3rd");
        Collection cl = h.values();
        Iterator itr = cl.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
