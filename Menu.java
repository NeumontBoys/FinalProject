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
            case 4: character.setPersonRace("");
            case 5: character.setPersonRace("");
            case 6: character.setPersonRace("");
            case 7: character.setPersonRace("");
            case 8: character.setPersonRace("");
            case 9: character.setPersonRace("");
            case 10: character.setPersonRace("");
        }
    }

    private String racePrompt(){
        return """
                Please select a race from the following options:
                1) Elf
                2) Dwarf
                3) Halfling
                4) 
                5) 
                6) 
                7) 
                8) 
                9) 
                10)
                """;
    }

    private void classSelect(){
        int selection = 0; //Get user input for number - Provide prompt
        switch (selection){
            case 1: character.setPersonClass("Rogue");
            case 2: character.setPersonClass("Mage");
            case 3: character.setPersonClass("Warrior");
            case 4: character.setPersonClass("");
            case 5: character.setPersonClass("");
            case 6: character.setPersonClass("");
            case 7: character.setPersonClass("");
            case 8: character.setPersonClass("");
            case 9: character.setPersonClass("");
            case 10: character.setPersonClass("");
        }
    }

    private String classPrompt(){
        return """
                Please select a class from the following options:
                1) Rogue
                2) Mage
                3) Warrior
                4) 
                5) 
                6) 
                7) 
                8) 
                9) 
                10)
                """;
    }
}
