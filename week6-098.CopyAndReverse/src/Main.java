
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

    }

    public static int[] copy(int[] array) {
        int length = array.length;
        int[] newArray = new int[length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    public static int[] reverseCopy(int[] array) {   
        int length = array.length;
        int[] newArray = new int[length];
        int index = 0;
        for (int i = length -1; i >= 0; i--) {
            newArray[index] = array[i];
            index++;
        }
        return newArray;
    }

}
