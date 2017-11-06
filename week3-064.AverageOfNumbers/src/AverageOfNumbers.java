
import java.util.ArrayList;

public class AverageOfNumbers {

    public static int sum(ArrayList<Integer> list) {
        int counter = 0;
        for (Integer num : list) {
            counter += num;
        }
        return counter;
    }

    public static double average(ArrayList<Integer> list) {
        // write code here
        return 1.0 * sum(list) / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
