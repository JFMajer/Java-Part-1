
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        if (text.isEmpty()){
            return true;
        }
        int len = text.length();
        int start = 0;
        int end = len - 1;
        while (true) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            } else if (start == end || start > end) {
                return true;
            } else {
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
