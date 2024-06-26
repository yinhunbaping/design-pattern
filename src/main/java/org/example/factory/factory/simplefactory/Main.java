package org.example.factory.factory.simplefactory;

import org.example.factory.factory.Human;

public class Main {
    public static void main(String[] args) {
        Human yellowRace = SimpleFactory.createInstance("yellowRace");
        yellowRace.laugh();

        System.out.println("===================");

        Human whiteRace = SimpleFactory.createInstance("whiteRace");
        whiteRace.laugh();
    }
}
