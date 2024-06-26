package org.example.factory.decorator;

/**
 * PUA装饰器
 */
public class PUADecorator extends AbstractDecorator{

    public PUADecorator(AbstractLeadershipCriticize leadershipCriticize) {
        super(leadershipCriticize);
    }

    public String doPUA() {
        return "咱们局可是XX市乃至全国都数一数二的，你能来这里工作，你应该感到很自豪才对，所以工作上的事情，还是要多放点心思，局里对你期待很高啊！";
    }

    @Override
    protected String getCriticizeContent() {
        return super.getCriticizeContent() + "\n " + doPUA();
    }
}
