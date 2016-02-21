/**
 * 在数组中查找指定元素
 */

import java.util.ArrayList;

public class Main8 {

    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        System.out.println("Array1: " + objArray);
        System.out.println("Array2: " + objArray2);
        System.out.println("objArray是否包含字符串common2?："
                + objArray.contains("common2"));
        System.out.println("objArray2是否包含数组objArray?："
                + objArray2.contains(objArray));
    }

}
