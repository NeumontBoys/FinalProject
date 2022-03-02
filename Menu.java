package edu.neumont.oop.Controller;

import edu.neumont.oop.Model.Character;
import lib.ConsoleIO;

public class Menu {
    //Called Classes
    Character character = new Character();
    Gameplay game = new Gameplay();

    public void start(){
        //Start with character creation
        nameSelect();
        raceSelect();
        classSelect();
        game.startGame();
    }

    private void nameSelect() {
        String name = ConsoleIO.promptForString("Enter Your Character's Name: ", false);
        character.setName(name);
    }

    private void raceSelect() {
        System.out.println("Please Select A Race For Your Character: ");
        int select = ConsoleIO.promptForMenuSelection(character.getRaces(), false);
        character.setRaceValue(select);
    }

    private void classSelect(){
        System.out.println("Please Select A Class For Your Character: ");
        int select = ConsoleIO.promptForMenuSelection(character.getClasses(), false);
        character.setClassValue(select);
    }
}
