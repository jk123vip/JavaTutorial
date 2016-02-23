/**
 * continue关键字的用法
 */

public class Main2 {

    public static void main(String[] args) {
        StringBuffer searchstr = new StringBuffer("hello how are you. ");
        int length = searchstr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchstr.charAt(i) != 'h')
                continue;
            count++;
            searchstr.setCharAt(i, 'h');
        }
            System.out.println("Found " + count + " 'h'.");
            System.out.println(searchstr);
    }

}
