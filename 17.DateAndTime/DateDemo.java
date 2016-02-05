import java.util.Date;
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

    }
}
