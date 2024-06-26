package org.example.factory.factory.factoryMethod;

import org.example.factory.factory.Human;
import org.example.factory.factory.YellowRace;

public class AsiaHumanFactory implements HumanFactory{
    @Override
    public Human createHuman() {
        return new YellowRace();
    }
}
