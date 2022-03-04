package edu.neumont.oop.Model;

import edu.neumont.oop.Controller.Die;

public class MonsterFactory {
    //Called Class
    Die die = new Die();

    //Arrays
    private final Monster[] monsters = new Monster[21];

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
            int hp = die.randomGenerator(3, 8);
            int ac = die.randomGenerator(2, 5);
            return new Monster("Wisp", hp, ac);
        }
        return null;
    }
    public Monster amalgamate(){
        if(die != null){
            int hp = die.randomGenerator(10, 16);
            int ac = die.randomGenerator(5, 9);
            return new Monster("Amalgamate", hp, ac);
        }
        return null;
    }
    public Monster bat(){
        if(die != null){
            int hp = die.randomGenerator(5, 10);
            int ac = die.randomGenerator(3, 8);
            return new Monster("Bat", hp, ac);
        }
        return null;
    }
    public Monster mimic(){
        if(die != null){
            int hp = die.randomGenerator(8, 12);
            int ac = die.randomGenerator(6, 10);
            return new Monster("Mimic", hp, ac);
        }
        return null;
    }
    public Monster mummy(){
        if(die != null){
            int hp = die.randomGenerator(10, 16);
            int ac = die.randomGenerator(7, 11);
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
            int hp = die.randomGenerator(45, 60);
            int ac = die.randomGenerator(11, 17);
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
            int hp = die.randomGenerator(65, 105);
            int ac = die.randomGenerator(13, 18);
            return new Monster("Shadow Brute", hp, ac);
        }
        return null;
    }
    //-----Aislin's Boss-----//
    public Monster lich(){
        if(die != null){
            int hp = die.randomGenerator(80, 110);
            int ac = die.randomGenerator(16, 18);
            return new Monster("Lich", hp, ac);
        }
        return null;
    }

    //Get Monsters
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