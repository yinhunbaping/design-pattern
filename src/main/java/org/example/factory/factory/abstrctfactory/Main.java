package org.example.factory.factory.abstrctfactory;

import org.example.factory.factory.Aeroplane;
import org.example.factory.factory.Human;
import org.example.factory.factory.Rocket;

public class Main {
    public static void main(String[] args) {
        ChinaFactory chinaFactory = new ChinaFactory();
        Rocket rocket = chinaFactory.createRocket();
        Aeroplane aeroplane = chinaFactory.createAeroplane();
        Human human = chinaFactory.createHuman();
        rocket.name();
        aeroplane.name();
        human.laugh();

        System.out.println("==========");

        AmericanFactory americanFactory = new AmericanFactory();
        Rocket rocket1 = americanFactory.createRocket();
        Aeroplane aeroplane1 = americanFactory.createAeroplane();
        Human human1 = americanFactory.createHuman();
        rocket1.name();
        aeroplane1.name();
        human1.laugh();
    }
}
