package edu.neumont.oop.Model;

public class Character extends InteractPerson {

    private String personRace;
    private int raceValue;
    private String personClass;
    private int classValue;

    private String[] classes = {"Wizard", "Rogue", "Sorcerer", "Barbarian", "Bard", "Archer", "Cleric", "Druid", "Warrior", "Mage"}; // 9-12
    private String[] races = {"Human", "Troll", "Grung", "Demon", "Elf", "burb", "Dryad", "Centaur", "Dwarf", "Halfling"}; // 9-12

    public Character(){};
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
    }; // returns race
    public void setPersonRace(int raceValue){
        switch (raceValue){
            case 1 -> this.personRace = races[0];
            case 2 -> this.personRace = races[1];
            case 3 -> this.personRace = races[2];
            case 4 -> this.personRace = races[3];
            case 5 -> this.personRace = races[4];
        }
    }; // sets race

    public int getRaceValue(){
        return raceValue;
    } // race value will determine race once known # of races is chosen
    public void setRaceValue(int raceValue) {
        this.raceValue = raceValue;
        setPersonRace(getRaceValue());
    } // will set the race value

    // ALL CLASS ORIENTED METHODS
    public String[] getClasses(){
        return this.classes;
    }
    public String getPersonClass(){
        return this.personClass;
    }; // returns Class
    public void setPersonClass(int personClass){
        switch (personClass){
            case 1 -> this.personClass = classes[0];
            case 2 -> this.personClass = classes[1];
            case 3 -> this.personClass = races[2];
            case 4 -> this.personClass = races[3];
            case 5 -> this.personClass = races[4];
        }
    }

    public int getClassValue() {
        return classValue;
    } // will determine class once known # of classes is chosen
    public void setClassValue(int classValue) {
        this.classValue = classValue;
        setPersonClass(getClassValue());
    } // will set class value

    // ALL DICE && CLASS ORIENTED METHODS
    @Override
    public void attack(InteractPerson target) {
        switch (getClassValue()){
            case 0:
            case 1:
            case 2:
            case 3:
        }
    }
    @Override
    public void defend() {
        switch (getClassValue()){
            case 0:
            case 1:
            case 2:
            case 3:
        }
    }
    @Override
    public void heal() {
        switch (getClassValue()){
            case 0:
            case 1:
            case 2:
            case 3:
        }
    }

    @Override
    public String toString() {
        return  super.getName() + " { " +
                "Race='" + getPersonRace() + '\'' +
                ", Class='" + getPersonClass() + '\'' +
                '}';
    }
}
