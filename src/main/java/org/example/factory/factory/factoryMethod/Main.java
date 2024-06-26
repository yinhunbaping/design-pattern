package org.example.factory.factory.factoryMethod;

import org.example.factory.factory.Human;

public class Main {
    public static void main(String[] args) {
        // 亚洲人工厂创建出黄种人
        AsiaHumanFactory asiaHumanFactory = new AsiaHumanFactory();
        Human asiaHuman = asiaHumanFactory.createHuman();
        asiaHuman.laugh();

        System.out.println("=============");

        // 美洲人工厂创建出白种人
        AmericaHumanFactory americaHumanFactory = new AmericaHumanFactory();
        Human americaHuman = americaHumanFactory.createHuman();
        americaHuman.laugh();
    }
}
