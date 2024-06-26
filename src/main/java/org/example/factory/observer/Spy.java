package org.example.factory.observer;

/**
 * 抽象间谍接口
 */
public interface Spy {
    /**
     * 收到监听信息后，马上处理
     */
    void handler(String noticeMsg, MsgType msgType);
}
