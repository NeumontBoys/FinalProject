package edu.neumont.oop.Model;

import edu.neumont.oop.Controller.Die;

public class Character extends InteractPerson {
    //Properties
    private String personRace;
    private int raceValue;
    private String personClass;
    private int classValue;

    //Called Class
    private Die die = new Die();

    //Arrays
    private final String[] classes = {"Wizard", "Rogue", "Sorcerer", "Barbarian", "Bard", "Archer", "Cleric", "Druid", "Warrior", "Mage"}; // 9-12
    private final String[] races = {"Human", "Troll", "Grung", "Demon", "Elf", "burb", "Dryad", "Centaur", "Dwarf", "Halfling"}; // 9-12

    //Constructors
    public Character(){}
    public Character(String name, int personRace, int personClass){
        setName(name);
        setRaceValue(personRace);
        setClassValue(personClass);
    }

    // All RACE ORIENTED METHODS
    public String[] getRaces(){
        return races;
    }

    public String getPersonRace(){
        return personRace;
    }
    public void setPersonRace(int raceValue){
        this.personRace = races[raceValue];
    }

    public int getRaceValue(){
        return raceValue;
    }
    public void setRaceValue(int raceValue) {
        this.raceValue = raceValue;
        setPersonRace(getRaceValue());
    }

    // ALL CLASS ORIENTED METHODS
    public String[] getClasses(){
        return this.classes;
    }

    public String getPersonClass(){
        return personClass;
    }
    public void setPersonClass(int personClass){
        this.personClass = classes[personClass];
    }

    public int getClassValue() {
        return classValue;
    }
    public void setClassValue(int classValue) {
        this.classValue = classValue;
        setPersonClass(getClassValue());
    }

    // ATTACK AND HEAL
    @Override
    public void attack(InteractPerson target){
        int roll = die.rollOnce(20);
        if(roll >= target.getArmorClass()){
            if (roll == 20){super.rollAndDealDamage(target, onCritAttack());}
            switch (getClassValue()){
                case 1 -> {super.rollAndDealDamage(target, die.rollMultiple(2, 8));}
                case 2 -> {super.rollAndDealDamage(target, die.rollMultiple(3, 8));}
                case 3 -> {super.rollAndDealDamage(target, die.rollMultiple(3, 6)); }
                case 4 -> {super.rollAndDealDamage(target, die.rollMultiple(2, 12)); }
                case 5 -> {super.rollAndDealDamage(target, die.rollMultiple(4, 8)); }
                case 6 -> {super.rollAndDealDamage(target, die.rollMultiple(2, 10)); }
                case 7 -> {super.rollAndDealDamage(target, die.rollMultiple(1, 8)); }
                case 8 -> {super.rollAndDealDamage(target, die.rollMultiple(2, 4)); }
                case 9 -> {super.rollAndDealDamage(target, die.rollMultiple(3, 10)); }
                case 10-> {super.rollAndDealDamage(target, die.rollMultiple(4, 4)); }
            }
        }
    }
    public int onCritAttack(){
        switch (getClassValue()){
            case 1 -> {return (die.rollMultiple(2, 8) * 2);}
            case 2 -> {return (die.rollMultiple(3, 8) * 2);}
            case 3 -> {return (die.rollMultiple(3, 6) * 2);}
            case 4 -> {return (die.rollMultiple(2, 12)* 2);}
            case 5 -> {return (die.rollMultiple(4, 8) * 2);}
            case 6 -> {return (die.rollMultiple(2, 10)* 2);}
            case 7 -> {return (die.rollMultiple(1, 8) * 2);}
            case 8 -> {return (die.rollMultiple(2, 4) * 2);}
            case 9 -> {return (die.rollMultiple(3, 10)* 2);}
            case 10-> {return (die.rollMultiple(4, 4) * 2);}
        }
        return -1;
    }

    @Override
    public void heal() {
        super.heal();
    }

    @Override
    public String toString() {
        return  super.getName() + '\n' +
                "Race: " + getPersonRace() + '\n' +
                "Class: " + getPersonClass() + '\n';
    }
}