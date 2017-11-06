/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> listOfPeople;

    public Phonebook() {
        this.listOfPeople = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.listOfPeople.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : this.listOfPeople) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.listOfPeople) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }

        }
        return "number not known";
    }

}
