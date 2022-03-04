package edu.neumont.oop.Model;

import lib.ConsoleIO;

import java.util.ArrayList;

public class Room {

    private ArrayList<Monster> monsters = new ArrayList<>();
    private PersonFactory pf = new PersonFactory();
    private Die d = new Die();
    private boolean isComplete = false;

    public Room(){
        makeRoom();
    }

    public int howManyMonsters(){
        return d.randomGenerator(2, 5);
    }

    public void populateRoom(){
        for (int i = 0; i < howManyMonsters(); i++) {
            Monster monster = pf.getMonsters()[d.randomGenerator(0, pf.getMonsters().length - 1)];
            monsters.add(monster);
        }
    }

    private void makeRoom(){
        howManyMonsters();
        populateRoom();
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
