package org.example.factory.strategy;

public class StrategyTwo implements AbstractStrategy{
    @Override
    public void exec() {
        System.out.println("善意的谎言告诫刘备不要沉迷温柔乡");
    }

    @Override
    public StrategyEnum strategyType() {
        return StrategyEnum.PLAN_B;
    }
}
