/**
 * for和foreach循环使用
 */

public class Main6 {

    public static void main(String[] args) {
        int[] intary = {1, 2, 3, 4};
        forDisplay(intary);
        System.out.println();
        foreachDisplay(intary);
    }

    public static void forDisplay(int[] a) {
        System.out.println("For Loop: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " " );
        }
    }

    public static void foreachDisplay(int[] a) {
        System.out.println("Foreach Loop: ");
        for (int integer : a) {
            System.out.print(integer + " ");
        }
    }

}
