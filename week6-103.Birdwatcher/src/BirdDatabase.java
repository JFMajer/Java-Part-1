
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jakub
 */
public class BirdDatabase {

    private ArrayList<Bird> listOfBirds;

    public BirdDatabase() {
        this.listOfBirds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.listOfBirds.add(bird);
    }

    public void addObservation(String birdName) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
            }
        }
    }

    public boolean checkIfValid(String birdName) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(birdName)) {
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (Bird bird : this.listOfBirds) {
            System.out.println(bird);
        }
    }

    public void show(String birdName) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird);
            }
        }
    }

}
