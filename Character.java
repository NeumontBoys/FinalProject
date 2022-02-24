package edu.neumont.oop.Model;

public class Character extends InteractPerson {

    private String personRace;
    private int raceValue;
    private String personClass;
    private int classValue;

    public Character(){};
    public Character(String name, String personRace, String personClass){
        setName(name);
        setPersonRace(personRace);
        setPersonClass(personClass);
    }

    // All RACE ORIENTED METHODS
    public String getPersonRace(){
        return personRace;
    }; // returns race
    public void setPersonRace(String race){
        this.personRace = race;
    }; // sets race
    public int getRaceValue(){
        return raceValue;
    } // race value will determine race once known # of races is chosen
    public void setRaceValue(int raceValue) {
        this.raceValue = raceValue;
    } // will set the race value

    // ALL CLASS ORIENTED METHODS
    public String getPersonClass(){
        return personClass;
    }; // returns Class
    public void setPersonClass(String personClass){
        this.personRace = personClass;
    }
    public int getClassValue() {
        return classValue;
    } // will determine class once known # of classes is chosen
    public void setClassValue(int classValue) {
        this.classValue = classValue;
    } // will set class value

    // ALL DICE && CLASS ORIENTED METHODS
    @Override
    public void attack(InteractPerson target) {
        super.attack(target);
    }
    @Override
    public void defend() {
        super.defend();
    }
    @Override
    public void heal() {
        super.heal();
    }
}
