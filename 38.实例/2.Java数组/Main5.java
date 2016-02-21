/**
 * 删除数组元素
 */

import java.util.ArrayList;

public class Main5 {

    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        objArray.clear();
        objArray.add(0, "第０个元素");
        objArray.add(1, "第１个元素");
        objArray.add(2, "第２个元素");
        System.out.println("数组删除元素前：" + objArray);
        objArray.remove(1);
        objArray.remove("0th element");
        System.out.println("数组删除元素后：" + objArray);
    }

}
