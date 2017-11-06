
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int length = text.length();
        String newString = "";
        while (length > 0) {
            newString += text.charAt(length - 1);
            length--;
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
