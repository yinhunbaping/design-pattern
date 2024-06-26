package org.example.factory.observer;

/**
 * 消息类型
 */
public enum MsgType {
    CLOSE(0, "迅速靠近"),
    FIRE(1, "立即开火")
    ;

    private final Integer id;
    private final String desc;

    MsgType(Integer id, String desc) {
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
