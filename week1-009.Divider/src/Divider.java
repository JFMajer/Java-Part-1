
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number1 = reader.nextInt();
        System.out.print("Type another number: ");
        int number2 = reader.nextInt();
        
        double result = 1.0 * number1 / number2;
        System.out.println("");
        System.out.println("Division: " + number1 + " / " + number2 + " = " + result);
    }
}
