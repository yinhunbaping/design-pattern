package org.example.factory.chain;

import java.util.Objects;

public class ChargeHandler implements AuditHandler{
    private AuditHandler nextHandler;

    public void setNextHandler(AuditHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void doAudit(AuditEnum auditEnum) {
        if(Objects.equals(auditEnum, AuditEnum.CHARGE)) {
            System.out.println(auditEnum.getDesc());
            nextHandler.doAudit(AuditEnum.BOSS);
        }else {
            System.out.println("审批提交错误，当前审批人为【主管】");
        }
    }
}
