package edu.neumont.oop.Controller;

import edu.neumont.oop.Model.Character;
import edu.neumont.oop.Model.Dungeon;
import edu.neumont.oop.Model.InteractPerson;
import edu.neumont.oop.Model.Monster;
import edu.neumont.oop.View.Output;
import lib.ConsoleIO;

public class Gameplay {
    //Called Classes
    Output output = new Output();
    Dungeon dungeon = new Dungeon();

    //Properties
    Character pc;

    public void startGame(){
        boolean selection = ConsoleIO.promptForBoolean(output.enterDungeonPrompt(), "Y", "N");
        if(selection){
            boolean loop = true;
            while (loop){
                roomHandling(pc);
            }
        }else{
            output.gameOver();
        }

    }

    // STRING[] FOR MENU PROMPTS
    public String[] roomsString(Dungeon dungeon){
        String[] rooms = new String[dungeon.getDungeon().size()];
        for (int i = 0; i < dungeon.getDungeon().size(); i++) {
            rooms[i] = ("Room " + (i + 1));
        }
        return rooms;
    }
    public String[] monstersString(int chosenRoom){
        String[] monsters = new String[dungeon.getDungeon().get(chosenRoom - 1).getMonsters().size()];
        for (int i = 0; i < dungeon.getDungeon().get(chosenRoom - 1).getMonsters().size(); i++) {
            monsters[i] = dungeon.getDungeon().get(chosenRoom - 1).getMonsters().get(i).getName();
        }
        return monsters;
    }

    // COMBAT
    public void attackOrHeal(InteractPerson target, Character self, int room){
        int aoh = ConsoleIO.promptForMenuSelection(output.attackOrHeal(), false) + 1;
        output.display(aoh + "");
        switch (aoh){
            case 1 -> {self.attackToHit(target); output.display(target.getName() + ", HP: " + target.getHp()); checkMonsterDeath(room);}
            case 2 -> self.heal();
        }
    }

    // ROOM HANDLING
    private int chooseRoom(){
        output.chooseARoom();
        int room = ConsoleIO.promptForMenuSelection(roomsString(dungeon), false) + 1;
        output.display("Room " + room + ": ");
        return room;
    }
    private Monster chooseMonsterInRoom(int room){
        output.chooseAMonster();
        int monster = ConsoleIO.promptForMenuSelection(monstersString(room), false);
        return dungeon.getDungeon().get(room - 1).getMonsters().get(monster);
    }
    private void roomHandling(Character user){
        boolean loop = true;
        int room = chooseRoom();
        while (loop){
            attackOrHeal(chooseMonsterInRoom(room), user, room);
        }
    }

    // DEATH HANDLING
    public void checkMonsterDeath(int room){
        for (int i = 0; i < dungeon.getDungeon().get(room).getMonsters().size(); i++) {
            if (dungeon.getDungeon().get(room).getMonsters().get(i).isDead()){
                dungeon.getDungeon().get(room).getMonsters().remove(i);
            }
        }
    }

    /*TODO LIST:
       GIVE DIALOGUE TO INDICATE HEAL OR ATTACK
       BACK AND FORTH IN COMBAT
       COMPLETE ROOMS , REMOVE FROM ARRAYLIST
       FINISH DUNGEON */
}