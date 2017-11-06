
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = reader.nextInt();
        double circ;
        circ = 2.0 * Math.PI * radius;
        System.out.println("");
        System.out.println("Circumference of the circle: " + circ);
    }
}
