package org.example.factory.strategy;

public class StrategyContext {
    private final AbstractStrategy abstractStrategy;

    public StrategyContext(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }

    /**
     * 出招
     */
    public void operate() {
        abstractStrategy.exec();
    }
}
