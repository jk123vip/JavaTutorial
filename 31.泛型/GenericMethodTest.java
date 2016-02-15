/** 泛型方法 */

public class GenericMethodTest {

    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型的数组: Integer, Double和Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray countains: ");
        printArray(intArray);

        System.out.println("Array doublArray countains: ");
        printArray(doubleArray);

        System.out.println("Array charArray countains: ");
        printArray(charArray);
    }

}
