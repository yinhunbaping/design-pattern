package org.example.factory.chain;

import java.util.Objects;

public class BossHandler implements AuditHandler{
    private AuditHandler nextHandler;

    public void setNextHandler(AuditHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void doAudit(AuditEnum auditEnum) {
        if(Objects.equals(auditEnum, AuditEnum.BOSS)) {
            System.out.println(auditEnum.getDesc());
            System.out.println("===========");
            System.out.println("请假审批通过...");
        }else {
            System.out.println("审批提交错误，当前审批人为【老板】");
        }
    }
}
