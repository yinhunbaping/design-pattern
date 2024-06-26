package org.example.factory.factory.abstrctfactory;

import org.example.factory.factory.*;

public class ChinaFactory implements AbstractFactory{

    @Override
    public Rocket createRocket() {
        return new ChinaRocket();
    }

    @Override
    public Aeroplane createAeroplane() {
        return new ChinaAeroplane();
    }

    @Override
    public Human createHuman() {
        return new YellowRace();
    }
}
