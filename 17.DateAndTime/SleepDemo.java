import java.util.*;

public class SleepDemo {

    public static void main(String[] main) {

        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

    }
}
