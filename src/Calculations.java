import java.io.PrintStream;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Calculations {
    public static void main(String[] args) {

        int firstNumber = 165;
        int secondNumber= 115;

        System.out.printf("%d + %d = %8d%n", firstNumber, secondNumber, firstNumber + secondNumber);
        System.out.printf("%d - %d = %8d%n", firstNumber, secondNumber, firstNumber - secondNumber);
        System.out.printf("%d * %d = %8d%n", firstNumber, secondNumber, firstNumber * secondNumber);
        System.out.printf("%d / %d = %8d%n%n", firstNumber, secondNumber, firstNumber / secondNumber);


        double firstNumberDouble = 165;
        double secondNumberDouble= 115;

        System.out.printf("%.2f + %.2f = %8.2f%n", firstNumberDouble, secondNumberDouble, firstNumberDouble + secondNumberDouble);
        System.out.printf("%.2f - %.2f = %8.2f%n", firstNumberDouble, secondNumberDouble, firstNumberDouble - secondNumberDouble);
        System.out.printf("%.2f * %.2f = %8.2f%n", firstNumberDouble, secondNumberDouble, firstNumberDouble * secondNumberDouble);
        System.out.printf("%.2f / %.2f = %8.2f%n", firstNumberDouble, secondNumberDouble, firstNumberDouble / secondNumberDouble);

    }
}
