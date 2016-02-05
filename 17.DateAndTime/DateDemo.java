import java.util.*;
import java.text.*;

public class DateDemo {

    public static void main(String[] args) {

        // 初始化Date对象
        Date date = new Date();
        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());

        // 使用SimpleDateFormat格式化日期
        Date dNow = new Date();
        SimpleDateFormat ft =
            new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zz");
        System.out.println("Current Date: " + ft.format(dNow));

        // 使用printf格式化日期
        // 初始化 Date 对象
        Date date = new Date();
        // 使用toString()显示日期和时间
        String str = String.format("Current Date/Time : %tc, date);
        System.out.printf(str);

        Date date = new Date();
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                          "Due date:", date);

        Date date = new Date();
        System.out.printf("%s %tB %<te, %<tY",
                          "Due date:", date);

        // 解析字符串为时间
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }

    }
}
