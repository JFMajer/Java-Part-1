
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
        
        while (counter <= num) {
            sum += Math.pow(2, counter);
            counter++;
        }
        
        System.out.println("The result is " + sum);
        
        
        
        
    }
}
