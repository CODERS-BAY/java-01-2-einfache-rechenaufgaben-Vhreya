import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Calculations {
    public static void main(String[] args) {

        int firstNumber = 165;
        int secondNumber= 115;

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " = " + firstNumber / secondNumber);
        System.out.println();


        double firstNumberDouble = 165;
        double secondNumberDouble= 115;

        System.out.println(firstNumberDouble + " + " + secondNumberDouble + " = " + (firstNumberDouble + secondNumberDouble));
        System.out.println(firstNumberDouble + " - " + secondNumberDouble + " = " + (firstNumberDouble - secondNumberDouble));
        System.out.println(firstNumberDouble + " * " + secondNumberDouble + " = " + firstNumberDouble * secondNumberDouble);
        System.out.println(firstNumberDouble + " / " + secondNumberDouble + " = " + firstNumberDouble / secondNumberDouble);

        //Wie kann ich die Dezimalstellen begrenzen?
    }
}
