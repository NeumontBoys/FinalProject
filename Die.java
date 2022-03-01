package edu.neumont.oop.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Die {
    //Properties
    private final Random random = new Random();
    private final BufferedReader inputSides = new BufferedReader(new InputStreamReader(System.in));
    private int roll;

    //Getter & Setter
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    //Roll methods
    public int rollOnce(int sides){
        while(sides < 4 || sides > 20){
            System.out.println("Please insert a valid number of sides: 4-20");
            sides = Integer.parseInt(String.valueOf(inputSides));
        }
        //Generates random number
        int dieSides = sides + 1;
        setRoll(random.nextInt(dieSides) - 1);
        return getRoll();
    }

    public int rollMultiple(int dieCount, int sides){
        if(dieCount < 1 || dieCount > 10){
            System.out.println("Please enter a valid number of dice: 1-10");
        }
        //Loop that calls rollOnce() for each die
        int totalRoll = 0;
        for(int dice = 0; dice < dieCount; dice++) {
            setRoll(rollOnce(sides));
            totalRoll += getRoll();
        }
        return totalRoll;
    }
    
    //Random Number Generator
    public int randomGenerator (int lowBound, int upBound){
        int randomNumber = random.nextInt((upBound - lowBound) + 1) + lowBound;
        return randomNumber;
    }
}
