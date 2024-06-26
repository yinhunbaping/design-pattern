package org.example.factory.decorator;

/**
 * 领导批评类(具体构件)
 */
public class LeadershipCriticize extends AbstractLeadershipCriticize{

    @Override
    protected String getCriticizeContent() {
        return "不过话又说回来，小张啊，你最近这段时间的工作态度出现了一点问题，上面对你可是有所非议啊...";
    }
}
