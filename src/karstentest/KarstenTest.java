package karstentest;

/**
 *
 * @author TAYOU NOUTSA Steve Caristan
 */
public class KarstenTest {

    /**
     * Method that changes the order of the elements in a string
     *
     * @param str value to change the order
     * @return the inversed string
     */
    static String inverseString(String str) {
        String inverseStr = str.charAt(str.length() - 1) + "";
        for (int i = 2; i <= str.length(); i++) {
            inverseStr += (str.charAt(str.length() - i) + "");
        }
        return inverseStr;
    }

    /**
     * Method that sum to numbers without arithmetical operator
     *
     * @param x first operand
     * @param y second operand
     * @return x+y
     */
    static int add(int x, int y) {

        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    /**
     * Method that return the string before comma
     *
     * @param str value to treat
     * @return the string before comma
     */
    static String afterCommaStr(String str) {
        return str.substring(0, str.indexOf("."));
    }

    public static void main(String args[]) {
        //Write test code here!!
    }
}
