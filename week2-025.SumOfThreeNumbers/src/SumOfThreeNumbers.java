
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        System.out.print("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        sum = sum + number1;

        System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        sum = sum + number2;

        System.out.print("Type the third number: ");
        int number3 = Integer.parseInt(reader.nextLine());
        sum = sum + number3;

        System.out.println("Sum: " + sum);
    }
}
