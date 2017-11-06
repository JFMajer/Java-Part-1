
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                break;
            }
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            list.add(new Student(name, number));
        }
        
        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String searchFor = reader.nextLine();
        System.out.println("Result: ");
        for (Student std : list) {
            if (std.getName().contains(searchFor)) {
                System.out.println(std);
            }
        }
    }
}
