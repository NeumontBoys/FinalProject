package edu.neumont.oop.Model;

import lib.ConsoleIO;

import java.util.ArrayList;

public class Dungeon {

    private final int MAX_ROOMS = 8;
    private final int MIN_ROOMS = 2;

    ArrayList<Room> dungeon = new ArrayList<>();

    private Room r = new Room();
    private Die d = new Die();

    private boolean isComplete = false;

    public Dungeon(){
        makeDungeon();
    }

    public int howManyRooms(){
        return d.randomGenerator(MIN_ROOMS, MAX_ROOMS);
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
