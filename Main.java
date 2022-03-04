package edu.neumont.oop;

import edu.neumont.oop.Controller.Gameplay;
import edu.neumont.oop.Model.*;
import edu.neumont.oop.View.Menu;
import lib.ConsoleIO;

public class Main {
    public static void main(String[] args) {
        Gameplay g = new Gameplay();
        g.startGame();
    }
}
