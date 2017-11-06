
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int limit = last - first;
        int counter = 0;
        int sum = first;
        
        
        while (counter < limit ) {
            sum = sum + (first + 1);
            counter++;
            first++;
            //System.out.println(sum);
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
