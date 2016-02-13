/** 封装 */

public class RunEncap {

    public static void main(String[] args) {

        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("123456ms");

        System.out.println("Name: " + encap.getName() +
                "\nAge: " + encap.getAge());

    }
}
