/**
 * 多个异常处理(多个catch)
 */

class Demo {

    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println(arr[4]); //制造第一处异常
        return a/b; //制造第二处异常
    }
}

class ExceptionDemo1 {

    public static void main(String[] args) {//throws Exception
        Demo d = new Demo();
        try {
            //int x = d.div(4, 0);
            //int x = d.div(5, 0);
            int x = d.div(4, 1);
            System.out.println("x=" + x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }

}
