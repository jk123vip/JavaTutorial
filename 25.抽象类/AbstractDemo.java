/** 抽象类 */

public class AbstractDemo {

    public static void main(String[] args) {

        /* 以下是不允许的，会印发错误 */
        Employee e = new Employee("George W.", "Houston, TX", 43);

        System.out.println("\nCall MailCheck using Employee reference--");
        e.mailCheck();

    }
}
