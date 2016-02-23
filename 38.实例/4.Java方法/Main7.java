/**
 * Varargs可变参数的使用
 */

public class Main7 {

    static int sumvarargs(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = sumvarargs(new int[] {10, 12, 33});
        System.out.println("The sum is: " + sum);
    }

}
