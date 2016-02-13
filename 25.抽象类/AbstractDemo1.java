/** 继承抽象类 */

public class AbstractDemo1 {

    public static void main(String[] args) {

        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        System.out.println("Call mailCheck using Salary reference--");
        s.mailCheck();

    }
}
