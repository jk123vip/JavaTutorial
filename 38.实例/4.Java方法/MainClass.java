/**
 * 方法重载
 */

class MyClass {
    int height;
    MyClass() {
        System.out.println("无参数构造函数");
        height = 4;
    }
    MyClass(int i) {
        System.out.println("房子高度为:"
                + i + "米");
        height = i;
    }
    void info() {
        System.out.println("The height is " + height + " meters");
    }
    void info(String s) {
        System.out.println(s + ": the height is " + height + " meters");
    }
}

public class MainClass {
    public static void main(String[] args) {
        MyClass t = new MyClass(3);
        t.info();
        t.info("abc"); // 重载构造函数
        new MyClass();
    }
}
