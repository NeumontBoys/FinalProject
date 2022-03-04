package edu.neumont.oop.View;

public class Output {
    public String promptForName(){
        return "Enter A Name For Your Character: ";
    }

    public String promptForRace(){
        return "Choose A Race For Your Character: ";
    }

    public String promptForClass(){
        return "Choose A Class For Your Character: ";
    }

    public void chooseARoom(){
        System.out.println("Please Choose A Room To Enter: ");
    }

    public void chooseAMonster(){
        System.out.println("Please Select A Monster: ");
    }

    public String[] attackOrHeal(){
        String[] aoh = {"Attack!", "Heal Self"};
        return aoh;
    }

    public String enterDungeonPrompt(){
        return "Enter The Dungeon? (Y/N): ";
    }

    public void gameOver(){
        System.out.println("G A M E   O V E R ! ! !");
    }

    public void display(String text){
        System.out.println(text);
    }
}