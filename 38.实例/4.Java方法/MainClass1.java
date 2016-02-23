/**
 * 输出数组元素
 */

public class MainClass1 {

    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
    }

    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
    }

    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        printArray(integerArray);
        printArray(doubleArray);
        printArray(characterArray);
    }

}
