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
    public Monster wisp(){
        InteractPerson wisp = new Monster();
        return (Monster) wisp;
    }
    public Monster amalgamate(){
        InteractPerson amalgamate = new Monster();
        return (Monster) amalgamate;
    }
    public Monster bat(){
        InteractPerson bat = new Monster();
        return (Monster) bat;
    }
    public Monster mimic(){
        InteractPerson mimic = new Monster();
        return (Monster) mimic;
    }
    public Monster mummy(){
        InteractPerson mummy = new Monster();
        return (Monster) mummy;
    }
    // 3 mini bosses
    public Monster champMinotaur(){
        InteractPerson champMinotaur = new Monster();
        return (Monster) champMinotaur;
    }
    public Monster giantRat(){
        InteractPerson giantRat = new Monster();
        return (Monster) giantRat;
    }
    // 3 boss
    public Monster theDuck(){
        InteractPerson theDuck = new Monster();
        return (Monster) theDuck;
    }
    public Monster shadowBrute(){
        InteractPerson shadowBrute = new Monster();
        return (Monster) shadwowBrute;
    }
}
