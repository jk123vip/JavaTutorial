/**
 * break关键字用法
 */

public class Main1 {

    public static void main(String[] args) {
        int[] intary = { 99, 12, 22, 34, 45, 67, 5678, 8990 };
        int no = 5678;
        int i = 0;
        boolean found = false;
        for ( ; i < intary.length; i++) {
            if (intary[i] == no) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(no + "'s index is " + i);
        } else {
            System.out.println(no + " is not here.");
        }
    }

}
