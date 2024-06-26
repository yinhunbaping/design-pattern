package org.example.factory.decorator;

/**
 * 抽象装饰类
 */
public abstract class AbstractDecorator extends AbstractLeadershipCriticize{
    private final AbstractLeadershipCriticize abstractLeadershipCriticize;

    public AbstractDecorator(AbstractLeadershipCriticize abstractLeadershipCriticize) {
        this.abstractLeadershipCriticize = abstractLeadershipCriticize;
    }

    @Override
    protected String getCriticizeContent() {
        return this.abstractLeadershipCriticize.getCriticizeContent();
    }
}
