package edu.neumont.oop.View;

import edu.neumont.oop.Model.Dungeon;
import edu.neumont.oop.Model.Room;
import lib.ConsoleIO;

public class Menu {

    public String promptForName(){
        return "Enter A Name For Your Character: ";
    }

    public String promptForRace(){
        return "Choose A Race For Your Character: ";
    }

    public String promptForClass(){
        return "Choose A Class For Your Character: ";
    }

    public String chooseARoom(){
        return "Please Choose A Room To Enter: ";
    }

    public String chooseAMonster(){
        return "Please Select A Monster: ";
    }

    public String[] attackOrHeal(){
        String[] aoh = {"1. Attack!", "2. Heal Self"};
        return aoh;
    }

    public String enterDungeonPrompt(){
        return "Enter The Dungeon? (Y/N):";
    }

    public String gameOver(){
        return "G A M E   O V E R ! ! !";
    }
}
