package org.example.factory.strategy;

public class StrategyOne implements AbstractStrategy{
    @Override
    public void exec() {
        System.out.println("让所有东吴人都知道刘备要娶孙尚香");
    }

    @Override
    public StrategyEnum strategyType() {
        return StrategyEnum.PLAN_A;
    }
}
