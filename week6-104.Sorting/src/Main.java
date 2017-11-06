
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (Integer num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int minIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        int number2 = array[index2];

        array[index1] = number2;
        array[index2] = number1;
    }

    public static void sort(int[] array) {
        System.out.print("At the beggining: ");
        System.out.println(Arrays.toString(array));
        int indexSmallest;
        for (int i = 0; i < array.length; i++) {
            indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }

}
