package org.example.factory.factory.factoryMethod;

import org.example.factory.factory.Human;
import org.example.factory.factory.WhiteRace;

public class AmericaHumanFactory implements HumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteRace();
    }
}
