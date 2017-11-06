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

public class Team {

    private String name;
    private ArrayList<Player> listOfPlayers;
    private int maxSize;

    public Team(String name) {
        this.maxSize = 16;
        this.name = name;
        this.listOfPlayers = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (this.listOfPlayers.size() == this.maxSize) {
            return;
        } else {
            this.listOfPlayers.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : this.listOfPlayers) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.listOfPlayers.size();
    }
    
    public int goals() {
        int sumOfGoals = 0;
        for (Player player : this.listOfPlayers) {
            sumOfGoals += player.goals();
        }
        return sumOfGoals;
    }

}
