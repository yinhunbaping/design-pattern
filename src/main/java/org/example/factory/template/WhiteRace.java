package org.example.factory.template;

public class WhiteRace extends AbstractTemplateMethod{
    @Override
    protected void laugh() {
        System.out.println("hh");
    }

    @Override
    protected void cry() {
        System.out.println("cry");
    }

    @Override
    protected void calm() {
        System.out.println("calm");
    }
}
