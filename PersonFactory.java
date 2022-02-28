package edu.neumont.oop.Model;

import lib.ConsoleIO;

public class PersonFactory {

    String[] classes; // 9-12
    String[] races; // 9-12
    // create character
    public Character characterCreator(String name, int playerRace, int playerClass){
        InteractPerson playerCharacter = new Character(name, playerRace, playerClass);
        return (Character) playerCharacter;
    }
    // 15 monsters
    public Monster skeleton(){
        InteractPerson skeleton = new Monster();
        return (Monster) skeleton;
    }
    public Monster slime(){
        InteractPerson slime = new Monster();
        return (Monster) slime;
    }
    public Monster zombie(){
        InteractPerson zombie = new Monster();
        return (Monster) zombie;
    }
    public Monster troll(){
        InteractPerson troll = new Monster();
        return (Monster) troll;
    }
    public Monster ogre(){
        InteractPerson ogre = new Monster();
        return (Monster) ogre;
    }
    // 3 mini bosses
    public Monster champMinotaur(){
        InteractPerson champMinotaur = new Monster();
        return (Monster) champMinotaur;
    }
    // 3 boss
    public Monster theDuck(){
        InteractPerson theDuck = new Monster();
        return (Monster) theDuck;
    }
}
