package org.example.factory.decorator;

/**
 * 表扬装饰器
 */
public class PraiseDecorator extends AbstractDecorator{

    public PraiseDecorator(AbstractLeadershipCriticize leadershipCriticize) {
        super(leadershipCriticize);
    }

    public String doPraise() {
        return "小张啊，前段时间咱们武侯区的XXX项目你完成的是非常不错，表现优秀，充分的展示了咱们局里的优良作风....";
    }

    @Override
    protected String getCriticizeContent() {
        return doPraise() + "\n" +  super.getCriticizeContent();
    }

}
