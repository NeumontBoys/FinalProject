package edu.neumont.oop.Controller;

import lib.ConsoleIO;

import java.util.Random;

public class Die {
    //Called Classes
    private final Random random = new Random();

    //Roll methods
    public int rollOnce(int sides){
        //Validate input
        while(sides < 4 || sides > 20){
            sides = ConsoleIO.promptForInt("Please insert a valid number of sides: 4-20", 4, 20);
        }
        //Generates random number
        int dieSides = sides + 1;
        return random.nextInt(dieSides) - 1;
    }

    public int rollMultiple(int dieCount, int sides){
        //Validate input
        if(dieCount < 1 || dieCount > 10){
            dieCount = ConsoleIO.promptForInt("Please enter a valid number of dice: 1-10", 1, 10);
        }
        //Loop that calls rollOnce() for each die
        int totalRoll = 0;
        for(int dice = 0; dice < dieCount; dice++) {
            totalRoll += rollOnce(sides);
        }
        return totalRoll;
    }

    //Random Number Generator
    public int randomGenerator (int lowBound, int upBound){
        int randomNumber = random.nextInt((upBound - lowBound) + 1) + lowBound;
        return randomNumber;
    }
}
