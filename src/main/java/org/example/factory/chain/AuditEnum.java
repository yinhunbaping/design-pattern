package org.example.factory.chain;

public enum AuditEnum {
    LEAD(1, "组长审批通过"),
    CHARGE(2, "主管审批通过"),
    BOSS(3, "老板审批通过")
    ;

    private final Integer id;
    private final String desc;

    AuditEnum(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
}
