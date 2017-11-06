
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter++;   
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 0;
        int n = 1;
        while (counter < size) {
            printWhitespaces(size - n);
            printStars(n);
            //System.out.println("");
            n++;
            counter++;
        }
    }

    public static void xmasTree(int height) {
        int counter = 1;
        int n = 1;
        while (counter <= height) {
            printWhitespaces(height - counter);
            printStars(n);
            n += 2;
            counter++;
        }
        int count = 0;
        while (count < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            count++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
