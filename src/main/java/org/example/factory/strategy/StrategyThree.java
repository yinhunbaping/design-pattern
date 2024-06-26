package org.example.factory.strategy;

public class StrategyThree implements AbstractStrategy{
    @Override
    public void exec() {
        System.out.println("找孙尚香断后，摆平追兵");
    }

    @Override
    public StrategyEnum strategyType() {
        return StrategyEnum.PLAN_C;
    }
}
