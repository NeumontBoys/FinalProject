package edu.neumont.oop.Controller;

import edu.neumont.oop.Model.Character;
import edu.neumont.oop.View.Output;
import lib.ConsoleIO;

public class Menu {
    //Called Classes
    Character character = new Character();
    Gameplay game = new Gameplay();
    Output output = new Output();

    //Start "Menu"
    public void start(){
        //Start with character creation
        game.pc = new Character(ConsoleIO.promptForString(output.promptForName() + '\n', false), raceSelect(), classSelect());
        game.startGame();
    }

    //Selection Menus
    private int raceSelect() {
        output.promptForRace();
        int selection = ConsoleIO.promptForMenuSelection(character.getRaces(), false);
        return selection - 1;
    }

    private int classSelect(){
        output.promptForClass();
        int selection = ConsoleIO.promptForMenuSelection(character.getClasses(), false);
        return selection - 1;
    }
}