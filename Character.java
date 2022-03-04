package edu.neumont.oop.Model;

import lib.ConsoleIO;

public class Character extends InteractPerson{

    // RACES AND CLASSES
    private final String[] playerClasses = {"Wizard", "Rogue", "Sorcerer", "Barbarian", "Bard", "Archer", "Cleric", "Druid", "Warrior", "Mage"};
    private final String[] playerRaces = {"Human", "Troll", "Grung", "Demon", "Elf", "burb", "Dryad", "Centaur", "Dwarf", "Halfling"};

    // VARIABLES
    private String playerClass;
    private String playerRace;
    private int classValue;
    private int raceValue;
    private Die d = new Die();

    // CONSTRUCTORS
    public Character(){}
    public Character(String name){
        super(name);
    }
    public Character(String name, int playerRace, int playerClass){
        super(name);
        setRaceValue(playerRace);
        setClassValue(playerClass);
    }

    // GETTERS FOR ARRAYS
    public String[] getPlayerClasses() {
        return playerClasses;
    }
    public String[] getPlayerRaces() {
        return playerRaces;
    }

    // GETTERS AND SETTERS FOR CLASS
    public String getPlayerClass() {
        return playerClass;
    }
    public void setPlayerClass(int playerClass) {
        this.playerClass = getPlayerClasses()[playerClass];
    }

    public int getClassValue() {
        return classValue;
    }
    public void setClassValue(int classValue) {
        this.classValue = classValue;
        setPlayerClass(getClassValue());
    }

    // GETTERS AND SETTERS FOR RACE
    public String getPlayerRace() {
        return playerRace;
    }
    public void setPlayerRace(int playerRace) {
        this.playerRace = getPlayerRaces()[playerRace];
    }

    public int getRaceValue() {
        return raceValue;
    }
    public void setRaceValue(int raceValue) {
        this.raceValue = raceValue;
        setPlayerRace(getRaceValue());
    }

    // ATTACK AND HEAL
    @Override
    public void attack(InteractPerson target){
        int roll = d.rollOnce(20);
        if(roll >= target.getArmorClass()){
            if (roll == 20){super.rollAndDealDamage(target, onCritAttack());}
            switch (getClassValue()){
                case 1 -> {super.rollAndDealDamage(target, d.rollMultiple(2, 8));}
                case 2 -> {super.rollAndDealDamage(target, d.rollMultiple(3, 8));}
                case 3 -> {super.rollAndDealDamage(target, d.rollMultiple(3, 6)); }
                case 4 -> {super.rollAndDealDamage(target, d.rollMultiple(2, 12)); }
                case 5 -> {super.rollAndDealDamage(target, d.rollMultiple(4, 8)); }
                case 6 -> {super.rollAndDealDamage(target, d.rollMultiple(2, 10)); }
                case 7 -> {super.rollAndDealDamage(target, d.rollMultiple(1, 8)); }
                case 8 -> {super.rollAndDealDamage(target, d.rollMultiple(2, 4)); }
                case 9 -> {super.rollAndDealDamage(target, d.rollMultiple(3, 10)); }
                case 10-> {super.rollAndDealDamage(target, d.rollMultiple(4, 4)); }
            }
        }
    }
    public int onCritAttack(){
        switch (getClassValue()){
            case 1 -> {return (d.rollMultiple(2, 8) * 2);}
            case 2 -> {return (d.rollMultiple(3, 8) * 2);}
            case 3 -> {return (d.rollMultiple(3, 6) * 2);}
            case 4 -> {return (d.rollMultiple(2, 12)* 2);}
            case 5 -> {return (d.rollMultiple(4, 8) * 2);}
            case 6 -> {return (d.rollMultiple(2, 10)* 2);}
            case 7 -> {return (d.rollMultiple(1, 8) * 2);}
            case 8 -> {return (d.rollMultiple(2, 4) * 2);}
            case 9 -> {return (d.rollMultiple(3, 10)* 2);}
            case 10-> {return (d.rollMultiple(4, 4) * 2);}
        }
        return -1;
    }

    @Override
    public void heal() {
        super.heal();
    }
}
