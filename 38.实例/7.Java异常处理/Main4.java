/**
 * 链试异常
 */

public class Main4 {
    public static void main(String[] args) throws Exception {
        int n = 20, result = 0;
        try {
            result = n / 0;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("发生算术异常:" + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("手动抛出异常:" + ex1);
            }
        }
    }
}
