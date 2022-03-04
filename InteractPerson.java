package edu.neumont.oop.Model;

import lib.ConsoleIO;

public abstract class InteractPerson {

    private String name;
    private int hp;
    private int armorClass;
    private Die d = new Die();
    private boolean isDead = false;

    public InteractPerson(){}
    public InteractPerson(String name){
        setName(name);
    }
    public InteractPerson(String name, int hp, int armorClass){
        setName(name);
        setHp(hp);
        setArmorClass(armorClass);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        if (hp <= 0){
            this.hp = 0;
            setDead(true);
        }else{
        this.hp = hp;
        }
    }

    public int getArmorClass() {
        return armorClass;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void attack(InteractPerson target){

    }

    public void rollAndDealDamage(InteractPerson target, int roll){
        ConsoleIO.display(getName() + " strikes " + target.getName() + " for " + roll + " damage!");
        target.setHp(target.getHp() - roll);
    }

    public void critAttack(){}

    public void attackToHit(InteractPerson target){
        int roll = d.rollOnce(20);
        if (roll >= target.getArmorClass()){
            ConsoleIO.display(getName() + " successfully hits " + target.getName() + "!");
            attack(target);
        } else{
            ConsoleIO.display(getName() + " missed!");
        }
    }
    public void heal(){}
}
