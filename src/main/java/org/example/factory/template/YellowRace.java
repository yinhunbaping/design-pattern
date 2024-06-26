package org.example.factory.template;

public class YellowRace extends AbstractTemplateMethod{
    @Override
    protected void laugh() {
        System.out.println("笑一笑，十年少");
    }

    @Override
    protected void cry() {
        System.out.println("哭一哭");
    }

    @Override
    protected void calm() {
        System.out.println("不哭也不笑");
    }
}
