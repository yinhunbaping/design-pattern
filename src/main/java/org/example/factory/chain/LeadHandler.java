package org.example.factory.chain;

import java.util.Objects;

public class LeadHandler implements AuditHandler{
    private AuditHandler nextHandler;

    public void setNextHandler(AuditHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void doAudit(AuditEnum auditEnum) {
        if(Objects.equals(auditEnum, AuditEnum.LEAD)) {
            System.out.println(auditEnum.getDesc());
            nextHandler.doAudit(AuditEnum.CHARGE);
        }else {
            System.out.println("审批提交错误，当前审批人为【组长】");
        }
    }
}
