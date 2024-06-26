package org.example.factory.factory.abstrctfactory;

import org.example.factory.factory.*;

public class AmericanFactory implements AbstractFactory{
    @Override
    public Rocket createRocket() {
        return new AmericanRocket();
    }

    @Override
    public Aeroplane createAeroplane() {
        return new AmericanAeroplane();
    }

    @Override
    public Human createHuman() {
        return new WhiteRace();
    }
}
