package edu.neumont.oop.Model;

import edu.neumont.oop.Controller.Die;
import edu.neumont.oop.View.Output;
import lib.ConsoleIO;

public abstract class InteractPerson {
    //Properties
    private String name;
    private int hp;
    private int armorClass;
    private boolean isDead = false;

    //Called Class
    Output output = new Output();

    // Name Getter & Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // HP Getter & Setter
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        if (hp <= 0){
            this.hp = 0;
            setDead(true);
        }else{
            this.hp = hp;
        }
    }

    // Armor Class Getter & Setter
    public int getArmorClass(){
        return armorClass;
    }
    public void setArmorClass(int armorClass){
        this.armorClass = armorClass;
    }

    // Death Methods
    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    // General Methods
    public void attack(InteractPerson target){

    }

    public void rollAndDealDamage(InteractPerson target, int roll){
        output.display(getName() + " strikes " + target.getName() + " for " + roll + " damage!");
        target.setHp(target.getHp() - roll);
    }

    public void critAttack(){}

    public void attackToHit(InteractPerson target){
        Die die = new Die();
        int roll = die.rollOnce(20);
        if (roll >= target.getArmorClass()){
            output.display(getName() + " successfully hits " + target.getName() + "!");
            attack(target);
        } else{
            output.display(getName() + " missed!");
        }
    }
    public void heal(){}
}