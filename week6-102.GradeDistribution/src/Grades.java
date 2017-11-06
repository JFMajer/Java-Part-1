
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Grades {
    private int grades[];
    

    public Grades() {
        this.grades = new int[6];
        Arrays.fill(grades, 0);
    }


    public void checkGrade(int points) {
        if (points >= 0 && points <= 29) {
            grades[0]++;
        } else if (points >= 30 && points <= 34) {
            grades[1]++;
        } else if (points >= 35 && points <= 39) {
            grades[2]++;
        } else if (points >= 40 && points <= 44) {
            grades[3]++;
        } else if (points >= 45 && points <= 49) {
            grades[4]++;
        } else if (points >= 50 && points <= 60) {
            grades[5]++;
        }
    }
    
    public void printGrades() {
        System.out.println("Grade distribution: ");
        for (int i = 5; i >=0; i--) {
            System.out.print(i + ": ");
            printStars(i);
        }
        
    }
    
    public void printStars(int grade) {
        int numOfStars = grades[grade];
        while (numOfStars > 0) {
            System.out.print("*");
            numOfStars--;
        }
        System.out.println("");
    }
    
    public double aceptance() {
        int numPositive = grades[1] + grades[2] + grades[3] + grades[4] + grades[5];
        int total = numPositive + grades[0];
        return (100.0 * numPositive) / total;
    }

}
