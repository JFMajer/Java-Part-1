
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String userName = reader.nextLine();
        System.out.print("Type your password: ");
        String userPass = reader.nextLine();
        
        if (userName.equals("alex") && userPass.equals("mightyducks") || userName.equals("emily") && userPass.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
