package org.example.factory.observer;

import java.util.Objects;

/**
 * 韩国间谍
 */
public class KoreaSpy implements Spy{

    @Override
    public void handler(String noticeMsg, MsgType msgType) {
        if(Objects.equals(msgType, MsgType.CLOSE)) {
            System.out.println("韩国间谍正在靠近...注意安全范围...over");
        }else if(Objects.equals(msgType, MsgType.FIRE)) {
            System.out.println("韩国间谍开火了...但是枪法略有偏差...目标仍然存活...over");
        }
    }
}
