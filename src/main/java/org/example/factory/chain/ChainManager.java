package org.example.factory.chain;

/**
 * 链式管理者
 */
public class ChainManager {

    /**
     * 提交审批
     */
    public void submitAudit() {
        AuditHandler auditHandler = getAuditHandler();
        auditHandler.doAudit(AuditEnum.LEAD);
    }

    /**
     * 获取审批处理程序
     */
    public AuditHandler getAuditHandler() {
        LeadHandler leadHandler = new LeadHandler();
        ChargeHandler chargeHandler = new ChargeHandler();
        BossHandler bossHandler = new BossHandler();

        leadHandler.setNextHandler(chargeHandler);
        chargeHandler.setNextHandler(bossHandler);
        return leadHandler;
    }
}
