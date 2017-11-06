import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        int counter = 1;
        while (counter <= name.length()) {
            System.out.print(name.charAt(name.length() - counter));
            counter++;
        }
    }
}
