
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Grades grades = new Grades();
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int num = Integer.parseInt(lukija.nextLine());
            if (num == -1) {
                break;
            } else if (num >= 0 && num <= 60) {
                grades.checkGrade(num);
            }
        }
        System.out.println("");
        grades.printGrades();
        System.out.println("Acceptance percentage: " + grades.aceptance());

    }
}
