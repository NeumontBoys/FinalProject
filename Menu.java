package edu.neumont.oop.Controller;

import edu.neumont.oop.Model.Character;
import lib.ConsoleIO;

public class Menu {
    //Called Classes
    Character character = new Character();
    Gameplay game = new Gameplay();

    public void start(){
        //Start with character creation
        new Character(ConsoleIO.promptForString("Enter character name: " + '\n', false), raceSelect(), classSelect());
        game.startGame();
    }

    private int raceSelect() {
        int selection = ConsoleIO.promptForMenuSelection(character.getRaces(), false);
        return selection - 1;
    }

    private int classSelect(){
        int selection = ConsoleIO.promptForMenuSelection(character.getClasses(), false);
        return selection - 1;
    }
}
