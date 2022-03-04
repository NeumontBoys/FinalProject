package edu.neumont.oop.Model;

import edu.neumont.oop.Controller.Die;
import java.util.ArrayList;

public class Dungeon {
    //Properties
    private final int MAX_ROOMS = 8;
    private final int MIN_ROOMS = 2;
    private boolean isComplete = false;
    ArrayList<Room> dungeon = new ArrayList<>();

    //Called Classes
    private Room room = new Room();
    private Die die = new Die();

    //Creation Methods
    public Dungeon(){
        makeDungeon();
    }

    public int howManyRooms(){
        return die.randomGenerator(MIN_ROOMS, MAX_ROOMS);
    }

    public void populateDungeon(){
        for (int i = 0; i < howManyRooms(); i++) {
            Room r = new Room();
            dungeon.add(r);
        }
    }

    public void makeDungeon(){
        howManyRooms();
        populateDungeon();
    }

    public ArrayList<Room> getDungeon() {
        return dungeon;
    }
}