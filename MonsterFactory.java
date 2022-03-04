package edu.neumont.oop.Model;

import edu.neumont.oop.Controller.Die;

public class MonsterFactory {
    //Called Class
    Die die = new Die();

    //Arrays
    private final Monster[] monsters = {skeleton(), slime(), zombie(), troll(), ogre(), wisp(), amalgamate(), bat(), mimic(), mummy(), ghost(), goblin(), hobgoblin(), bugBear(), construct()};
    private final Monster[] miniBosses = {champMinotaur(), giantFuckinRat(), banshee()};
    private final Monster[] bosses = {theDuck(), shadowBrute(), lich()};

    // 15 monsters
    //-----Matthan's Monsters-----//
    public Monster skeleton(){
        if(die != null){
            int hp = die.randomGenerator(5, 8);
            int ac = die.randomGenerator(3, 5);
            return new Monster("Skeleton", hp, ac);
        }
        return null;
    }
    public Monster slime(){
        if(die != null){
            int hp = die.randomGenerator(3, 12);
            int ac = die.randomGenerator(1, 3);
            return new Monster("Slime", hp, ac);
        }
        return null;
    }
    public Monster zombie(){
        if(die != null){
            int hp = die.randomGenerator(5, 15);
            int ac = die.randomGenerator(5, 10);
            return new Monster("Zombie", hp, ac);
        }
        return null;
    }
    public Monster troll(){
        if(die != null){
            int hp = die.randomGenerator(20, 30);
            int ac = die.randomGenerator(7, 13);
            return new Monster("Troll", hp, ac);
        }
        return null;
    }
    public Monster ogre(){
        if(die != null){
            int hp = die.randomGenerator(15, 18);
            int ac = die.randomGenerator(10, 13);
            return new Monster("Ogre", hp, ac);
        }
        return null;

    }
    //-----Mabel's Monsters-----//
    public Monster wisp(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("Wisp", hp, ac);
        }
        return null;
    }
    public Monster amalgamate(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("Amalgamate", hp, ac);
        }
        return null;
    }
    public Monster bat(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("Bat", hp, ac);
        }
        return null;
    }
    public Monster mimic(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("Mimic", hp, ac);
        }
        return null;
    }
    public Monster mummy(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("Mummy", hp, ac);
        }
        return null;
    }
    //-----Aislin's Monsters-----//
    public Monster ghost(){
        if(die != null){
            int hp = die.randomGenerator(10, 12);
            int ac = die.randomGenerator(5, 8);
            return new Monster("Ghost", hp, ac);
        }
        return null;
    }
    public Monster goblin(){
        if(die != null){
            int hp = die.randomGenerator(2, 6);
            int ac = die.randomGenerator(2, 4);
            return new Monster("Goblin", hp, ac);
        }
        return null;
    }
    public Monster hobgoblin(){
        if(die != null){
            int hp = die.randomGenerator(6, 10);
            int ac = die.randomGenerator(4, 6);
            return new Monster("Hobgoblin", hp, ac);
        }
        return null;
    }
    public Monster bugBear(){
        if(die != null){
            int hp = die.randomGenerator(10, 15);
            int ac = die.randomGenerator(8, 14);
            return new Monster("Bug Bear", hp, ac);
        }
        return null;
    }
    public Monster construct(){
        if(die != null){
            int hp = die.randomGenerator(20, 23);
            int ac = die.randomGenerator(13, 16);
            return new Monster("Construct", hp, ac);
        }
        return null;
    }
    //--------------------------------------------------
    // 3 mini bosses
    //-----Matthan's Mini-Boss-----//
    public Monster champMinotaur(){
        if(die != null){
            int hp = die.randomGenerator(40,55);
            int ac = die.randomGenerator(12,16);
            return new Monster("Champion Minotaur", hp, ac);
        }
        return null;
    }
    //-----Mabel's Mini-Boss-----//
    public Monster giantFuckinRat(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("The Rat King", hp, ac);
        }
        return null;
    }
    //-----Aislin's Mini-Boss-----//
    public Monster banshee(){
        if(die != null){
            int hp = die.randomGenerator(30, 40);
            int ac = die.randomGenerator(14, 16);
            return new Monster("Banshee", hp, ac);
        }
        return null;
    }
    //--------------------------------------------------
    // 3 boss
    //-----Matthan's Boss-----//
    public Monster theDuck(){
        if(die != null){
            int hp = die.randomGenerator(75, 100);
            int ac = die.randomGenerator(15, 18);
            return new Monster("The Duck", hp, ac);
        }
        return null;
    }
    //-----Mabel's Boss-----//
    public Monster shadowBrute(){
        if(die != null){
            int hp = die.randomGenerator(0, 0);
            int ac = die.randomGenerator(0, 0);
            return new Monster("Shadow Brute", hp, ac);
        }
        return null;
    }
    //-----Aislin's Boss-----//
    public Monster lich(){
        if(die != null){
            int hp = die.randomGenerator(80, 100);
            int ac = die.randomGenerator(16, 18);
            return new Monster("Lich", hp, ac);
        }
        return null;
    }

    //Get Monsters
    public Monster[] getMonsters() {
        return monsters;
    }
    public Monster[] getMiniBosses() {
        return miniBosses;
    }
    public Monster[] getBosses() {
        return bosses;
    }
}
