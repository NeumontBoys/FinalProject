package edu.neumont.oop.Model;

import edu.neumont.oop.Controller.Die;
import lib.ConsoleIO;

import java.util.ArrayList;

public class Room {
    //Called Classes
    private MonsterFactory monsterFactory = new MonsterFactory();
    private Die die = new Die();

    //Properties
    private ArrayList<Monster> monsters = new ArrayList<>();
    private boolean isComplete = false;

    //Constructor
    public Room(){
        makeRoom();
    }

    //Create and populate room
    private void makeRoom(){
        howManyMonsters();
        populateRoom();
    }

    public int howManyMonsters(){
        int howMany = die.randomGenerator(1,5);
        return howMany;
    }

    public void populateRoom(){
        for (int i = 0; i < howManyMonsters(); i++) {
            Monster monster = monsterFactory.getMonsters()[die.randomGenerator(0, monsterFactory.getMonsters().length - 1)];
            monsters.add(monster);
        }
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    //Complete?
    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}