/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Bird {
    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObserved() {
        return observed;
    }
    
    public void addObservation() {
        this.observed++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
    
    
    
}
