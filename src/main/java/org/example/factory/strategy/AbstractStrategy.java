package org.example.factory.strategy;

public interface AbstractStrategy {
    /**
     * 执行策略
     */
    void exec();

    /**
     * 策略类型
     */
    StrategyEnum strategyType();
}
