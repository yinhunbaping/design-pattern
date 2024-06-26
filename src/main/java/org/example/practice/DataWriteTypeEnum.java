package org.example.practice;

/**
 * 写数据类型枚举
 */
public enum DataWriteTypeEnum {
    ADD(1, "新增"),
    UPDATE(2, "更新"),
    DELETE(3, "删除")
    ;
    private final Integer id;
    private final String desc;

    DataWriteTypeEnum(Integer id, String desc) {
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
