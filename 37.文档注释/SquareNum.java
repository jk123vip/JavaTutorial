import java.io.*;

/**
 * This class demostrates documentation comments.
 * @author Ayan Amhed
 * @version 1.2
 */
public class SquareNum {
    /**
     * This method returns the square of num.
     * This is a multiline descritption. You can use
     * as many lines as you like.
     * @param num The value to be square.
     * @return num squared.
     */
    public double square(double num) {
        return num * num;
    }
    /**
     * This method inputs a number from the user.
     * @return The value input as a double.
     * @exception IOException on input error.
     * @see IOException
     */
    public double getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;
        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }
    /**
     * This method demonstrates square().
     * @param args Unused.
     * @exception IOException on input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Enter value to be squared: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Squared value is: " + val);
    }

}
