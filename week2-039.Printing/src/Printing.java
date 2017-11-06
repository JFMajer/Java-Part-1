public class Printing {

    public static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int counter = 0;
        while (counter < sideSize) {
            printStars(sideSize);
            //System.out.println("");
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 0;
        while (counter < height) {
            printStars(width);
            //System.out.println("");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int amountStars = 1;
        while (amountStars <= size) {
            printStars(amountStars);
            //System.out.println("");
            amountStars++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
