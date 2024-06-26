package org.example.factory.chain;

/**
 * 审核处理接口
 */
public interface AuditHandler {

    /**
     * 执行审批
     */
    void doAudit(AuditEnum auditEnum);
}
