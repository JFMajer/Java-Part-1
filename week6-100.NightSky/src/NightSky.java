
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jakub
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    //private Random r;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        //this.r = new Random();
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public void printLine() {
        Random r = new Random();
        for (int i = 0; i < this.width; i++) {
            double randomNum = r.nextDouble();
            if (randomNum < this.density) {
                this.starsInLastPrint++;
                System.out.print("*");              
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
    
    
    

}
