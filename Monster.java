package edu.neumont.oop.Model;

public class Monster extends InteractPerson{
    //Constructor
    public Monster(){};
    public Monster(String name, int hp, int armorClass){
        setName(name);
        setHp(hp);
        setArmorClass(armorClass);
    }

    @Override
    public void attack(InteractPerson target) {
        super.attack(target);
    }

    @Override
    public void heal() {
        super.heal();
    }
}