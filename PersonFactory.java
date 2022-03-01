package edu.neumont.oop.Model;

import lib.ConsoleIO;

public class PersonFactory {

    // create character
    public Character characterCreator(){
        Character playerCharacter = new Character();
        boolean bLoop = true;
        while (bLoop){
            String name = ConsoleIO.promptForString("Enter your character's name: ", false);
            int pClass = ConsoleIO.promptForMenuSelection((playerCharacter.getClasses()), false) + 1;
            int pRace = ConsoleIO.promptForMenuSelection((playerCharacter.getRaces()), false) + 1;
            Character player = new Character(name, pRace, pClass);
            boolean cont = ConsoleIO.promptForBoolean(player.getName() + ", the " + player.getPersonRace() + " " + player.getPersonClass() + ". Correct?", "Yes", "No");
            if (cont){
                bLoop = false;
                return player;
            }
        }
        return playerCharacter;
    }

    // 15 monsters
    // 3 mini bosses
    // 3 boss
    /////////////////////////////////////////////////////////// Matthan's Creatures Below
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

    public Monster champMinotaur(){
        InteractPerson champMinotaur = new Monster();
        return (Monster) champMinotaur;
    }

    public Monster theDuck(){
        InteractPerson theDuck = new Monster();
        return (Monster) theDuck;
    }
    /////////////////////////////////////////////////////////// Matthan's Creatures Above
    /////////////////////////////////////////////////////////// Mabel's Creatures Below
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

    public Monster giantFuckinRat(){
        InteractPerson giantRat = new Monster();
        return (Monster) giantRat;
    }

    public Monster shadowBrute(){
        InteractPerson shadowBrute = new Monster();
        return (Monster) shadowBrute;
    }
    /////////////////////////////////////////////////////////// Mabel's Creatures Above
}
