
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jakub
 */
public class Control {

    private Scanner reader;
    private BirdDatabase newDatabase;

    public Control() {
        this.reader = new Scanner(System.in);
        this.newDatabase = new BirdDatabase();

    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = reader.nextLine();
            if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("Statistics")) {
                statistics();
            } else if (command.equals("Quit")) {
                break;
            } else if (command.equals("Show")) {
                show();
            }
        }

    }

    public void add() {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin name: ");
        String latinName = reader.nextLine();
        newDatabase.addBird(name, latinName);
    }
    
    public void statistics() {
        newDatabase.printAll();
    }
    
    public void show() {
        System.out.print("What? ");
        String birdName = reader.nextLine();
        newDatabase.show(birdName);
    }

    public void observation() {
        System.out.print("What was observed:? ");
        String birdName = reader.nextLine();
        if (newDatabase.checkIfValid(birdName)) {
            newDatabase.addObservation(birdName);
        } else {
            System.out.println("Is not a bird!");
        }
    }
    
  

}
