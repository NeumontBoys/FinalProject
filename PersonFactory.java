package edu.neumont.oop.Model;

import edu.neumont.oop.View.Menu;
import lib.ConsoleIO;

import java.util.ArrayList;

public class PersonFactory {

    private final Monster[] monsters = new Monster[21];


    private Die d = new Die();
    private Menu m = new Menu();

    public Character createCharacter(){
        boolean bLoop = true;
        while (bLoop){
            Character playerCharacter = new Character(ConsoleIO.promptForString(m.promptForName(), false)); //uses ConsoleIO for String
            ConsoleIO.display(m.promptForRace()); // outputs String from menu prompt
            playerCharacter.setRaceValue(ConsoleIO.promptForMenuSelection(playerCharacter.getPlayerRaces(), false)); //sets the int raceValue through ConsoleIO
            ConsoleIO.display(m.promptForClass()); // outputs String from menu prompt
            playerCharacter.setClassValue(ConsoleIO.promptForMenuSelection(playerCharacter.getPlayerClasses(), false)); // sets int ClassValue through ConsoleIO
            if (ConsoleIO.promptForBoolean(playerCharacter.getName() + ", the " + playerCharacter.getPlayerRace() + " " + playerCharacter.getPlayerClass() + ", correct? (Y/N) ",
                    "Y", "N")){ // Verifies with user that the information is correct, will loop if incorrect
                bLoop = false;
                return playerCharacter;
            }
        }
        return null;
    }

    // MATTHAN'S MONSTERS
    public Monster skeleton(){
        if (d!= null){
            InteractPerson skeleton = new Monster("Skeleton", d.randomGenerator(5, 9), d.randomGenerator(5,8));
            return (Monster) skeleton;
        }
        return null;
    }
    public Monster slime(){
        if (d!= null){
            InteractPerson slime = new Monster("Slime", d.randomGenerator(3, 12), d.randomGenerator(1, 3));
            return (Monster) slime;
        }
        return null;
    }
    public Monster zombie(){
        if (d!= null){
            InteractPerson zombie = new Monster("Zombie", d.randomGenerator(5, 15), d.randomGenerator(5, 10));
            return (Monster) zombie;
        }
        return null;
    }
    public Monster troll(){
        if (d!= null){
            return new Monster("Troll", d.randomGenerator(20, 30), d.randomGenerator(7, 13));
        }
        return null;
    }
    public Monster ogre(){
        if (d!= null){
            return new Monster("Ogre", d.randomGenerator(15, 18), d.randomGenerator(10, 13));
        }
        return null;
    }
    public Monster champMinotaur(){
        if (d!= null){
            return new Monster("Champion Minotaur", d.randomGenerator(40,55), d.randomGenerator(12,16));
        }
        return null;
    }
    public Monster theDuck(){
        if (d!= null){
            return new Monster("The Duck", d.randomGenerator(75, 100), d.randomGenerator(15, 18));
        }
        return null;
    }

    // MABEL'S MONSTERS
    public Monster wisp(){
        if (d!= null){
            return new Monster("Wisp", d.randomGenerator(3,8), d.randomGenerator(2,5));
        }
        return null;
    }
    public Monster amalgamate(){
        if (d!= null){
            return new Monster("Amalgamate", d.randomGenerator(10,16), d.randomGenerator(5,9));
        }
        return null;
    }
    public Monster bat(){
        if (d!= null){
            return new Monster("Bat", d.randomGenerator(5,10), d.randomGenerator(3,8));
        }
        return null;
    }
    public Monster mimic(){
        if (d!= null){
            return new Monster("Mimic", d.randomGenerator(8,12), d.randomGenerator(6,10));
        }
        return null;
    }
    public Monster mummy(){
        if (d!= null){
            return new Monster("Mummy", d.randomGenerator(10,16), d.randomGenerator(7,11));
        }
        return null;
    }
    public Monster giantFuckinRat(){
        if (d!= null){
            return new Monster("The Rat King", d.randomGenerator(45, 60), d.randomGenerator(11, 17));
        }
        return null;
    }
    public Monster shadowBrute(){
        if (d!= null){
            return new Monster("Shadow Brute", d.randomGenerator(65, 105), d.randomGenerator(13, 18));
        }
        return null;
    }

    // AISLIN'S MONSTERS
    public Monster ghost(){
        if (d!= null){
            return new Monster("Ghost", d.randomGenerator(10, 12), d.randomGenerator(5, 8));
        }
        return null;
    }
    public Monster goblin(){
        if (d!= null){
            return new Monster("Goblin", d.randomGenerator(2, 6), d.randomGenerator(2, 4));
        }
        return null;
    }
    public Monster hobgoblin(){
        if (d!= null){
            return new Monster("Hobgoblin", d.randomGenerator(6, 10), d.randomGenerator(4, 6));
        }
        return null;
    }
    public Monster bugBear(){
        if (d!= null){
            return new Monster("Bug Bear", d.randomGenerator(10, 15), d.randomGenerator(8, 14));
        }
        return null;
    }
    public Monster construct(){
        if (d!= null){
            return new Monster("Construct", d.randomGenerator(20, 23), d.randomGenerator(13, 16));
        }
        return null;
    }
    public Monster banshee(){
        if (d!= null){
            return new Monster("Banshee", d.randomGenerator(30, 40), d.randomGenerator(14, 16));
        }
        return null;
    }
    public Monster lich(){
        if (d!= null){
            return new Monster("Lich", d.randomGenerator(80, 100), d.randomGenerator(16, 18));
        }
        return null;
    }

    // ARRAY GETTER

    public Monster[] getMonsters() {
        monsterPop();
        return monsters;
    }

    public void monsterPop(){
        monsters[0] = skeleton();
        monsters[1] = slime();
        monsters[2] = zombie();
        monsters[3] = troll();
        monsters[4] = ogre();
        monsters[5] = champMinotaur();
        monsters[6] = theDuck();
        monsters[7] = wisp();
        monsters[8] = amalgamate();
        monsters[9] = bat();
        monsters[10] = mimic();
        monsters[11] = mummy();
        monsters[12] = giantFuckinRat();
        monsters[13] = shadowBrute();
        monsters[14] = ghost();
        monsters[15] = goblin();
        monsters[16] = hobgoblin();
        monsters[17] = bugBear();
        monsters[18] = construct();
        monsters[19] = banshee();
        monsters[20] = lich();
    }
}
