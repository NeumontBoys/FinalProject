package edu.neumont.oop.Model;

public abstract class InteractPerson {

    private String name;
    private int hp;
    private int armorClass;
    private int tempArmorClas;

    // NAME GET AND SET
    public String getName(){
        return name;
    }; // returns name
    public void setName(String name){
        this.name = name;
    }; // sets name
    // HP GET AND SET
    public int getHp(){
        return hp;
    }; // returns hp
    public void setHp(int hp){
        this.hp = hp;
    }; // sets hp
    // ARMORCLASS GET AND SET
    public int getArmorClass(){
        return armorClass;
    }; // returns armorClass
    public void setArmorClass(int armorClass){
        this.armorClass = armorClass;
    }; // sets armorClass
    // TEMP-ARMORCLASS GET AND SET
    public int getTempArmorClas() {
        return tempArmorClas;
    }
    public void setTempArmorClas(int tempArmorClas) {
        this.tempArmorClas = tempArmorClas;
    }

    // General Methods
    public void attack(InteractPerson target){
        // roll to hit, then roll attack dice. remove attack dice value from target HP
    }; // removes set amount of health from 'target'
    public void heal(){
        // roll to attempt, roll to heal
    }; // heal self
    public void defend(){
        // roll to attempt, roll for temp raise
    }; // raises self-armorClass
}
