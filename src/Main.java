//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import static java.lang.Float.floatToIntBits;
import java.math.BigDecimal;

/**
 * AD 315 Assignment
 * Understanding IEEE 754 Floating Point Numbers
 * Question 1 - 6
 * Question 7 answer is posted on Github Readme
 */

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("AD 315 Assignment");

        iEEE754(7.9);
        add1();
        add2();
        special();
        overflows();
        precisionLoss();

    }

    /**
     * IEEE 754 floating point representation conversion
     */
    public static void iEEE754(double number) {
        System.out.println("Converting "+number + " according to IEEE 754 32-bit layout");
        float floatNum = (float) number;
        System.out.print("The output is ");
        System.out.println(floatToIntBits(floatNum));
    }

    public static void add1() {
        System.out.println("\n Let's see the result of 0.1 + 0.2");
        System.out.print(0.1+0.2);
    }

    public static void add2() {
        System.out.println("\n \n Let's see the result of 1.0 // 3.0");
        System.out.print(1.0/3.0);
    }

    public static void special() {
        System.out.println();
        System.out.println();
        // positive infinity
        System.out.println(1.0/0);
        // negative infinity
        System.out.println(-1.0/0);
        // Not a number
        System.out.println(0.0f/0.0f);
    }

    public static void overflows() {
        System.out.println("Overflow generally means that values have grown too large to be represented. Underflow is a less serious problem because is just denotes a loss of precision, which is guaranteed to be closely approximated by zero.");
        // overflow example
        System.out.println();
        // underflow example
    }

    public static void precisionLoss() {
        // Demonstrate precision loss for very small numbers
        System.out.println("Precision loss for very small numbers:");
        for (int i = -300; i < 0; i += 50) {
            double value = Math.pow(10, i);
            double precisionLoss = calculatePrecisionLoss(value);
            System.out.printf("Value: %e, Precision Loss: %e%n", value, precisionLoss);
        }

        // Demonstrate precision loss for very large numbers
        System.out.println("\nPrecision loss for very large numbers:");
        for (int i = 0; i < 300; i += 50) {
            double value = Math.pow(10, i);
            double precisionLoss = calculatePrecisionLoss(value);
            System.out.printf("Value: %e, Precision Loss: %e%n", value, precisionLoss);
        }
    }

    private static double calculatePrecisionLoss(double value) {
        BigDecimal bigDecimal = new BigDecimal(value);
        double doubleValue = bigDecimal.doubleValue();
        return Math.abs(value - doubleValue);
    }
}