package edu.neumont.oop.Controller;

import edu.neumont.oop.Model.Character;
import lib.ConsoleIO;

public class Menu {
    //Called Classes
    Character character = new Character();

    public void start(){
        //Start with character creation
        //Prompt for character name?
        raceSelect();
        classSelect();
    }

    private void raceSelect() {
        int selection = 0; //Get user input for number - Provide prompt
        switch (selection){
            case 1: character.setPersonRace("Elf");
            case 2: character.setPersonRace("Dwarf");
            case 3: character.setPersonRace("Halfling");
            //...
        }
    }

    private String racePrompt(){
        return "";
    }

    private void classSelect(){
        int selection = 0; //Get user input for number - Provide prompt
        switch (selection){
            case 1: character.setPersonClass("Warrior");
            case 2: character.setPersonClass("Mage");
            case 3: character.setPersonClass("Rogue");
            //...
        }
    }

    private String classPrompt(){
        return "";
    }
}