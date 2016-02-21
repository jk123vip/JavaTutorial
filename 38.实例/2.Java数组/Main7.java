/**
 * 数组交集
 */

import java.util.ArrayList;

public class Main7 {

    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "notcommon2");
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        System.out.println("Array1: " + objArray);
        System.out.println("Array2: " + objArray2);
        objArray.retainAll(objArray2);
        System.out.println("array1和array2的交集为：" + objArray);
    }

}
