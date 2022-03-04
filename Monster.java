package edu.neumont.oop.Model;

public class Monster extends InteractPerson{

    // CONSTRUCTORS
    public Monster(){}
    public Monster(String name){
        super(name);
    }
    public Monster(String name, int hp, int armorClass){
        super(name, hp, armorClass);
    }

    // ATTACK AND HEAL

    @Override
    public void attack(InteractPerson target) {

    }

    @Override
    public void heal() {

    }


}
