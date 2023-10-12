// Example 5: CalculateDoubleNumber.java
import java.util.Scanner;

public class CalculateDoubleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);

        System.out.println("Sum of 2 double numbers: " + (num1 + num2));
        System.out.println("Difference of 2 double numbers: " + (num1 - num2));
        System.out.println("Product of 2 double numbers: " + (num1 * num2));
        System.out.println("Quotient of 2 double numbers: " + (num1 / num2));
    }
}