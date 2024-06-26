package org.example.factory.strategy;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 策略工厂
 */
@Component
public class StrategyFactory {
    @Resource
    private List<AbstractStrategy> abstractStrategyList;

    public AbstractStrategy getStrategy(StrategyEnum strategyEnum) {
        return abstractStrategyList.stream()
                .filter(Objects::nonNull)
                .filter(e -> Objects.equals(e.strategyType(), strategyEnum))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
