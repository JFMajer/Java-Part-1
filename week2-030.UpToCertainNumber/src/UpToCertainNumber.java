
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        
        int dis = 1;
        while(dis <= number) {
            System.out.println(dis);
            dis++;
        }
        
    }
}
