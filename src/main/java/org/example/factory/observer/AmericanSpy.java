package org.example.factory.observer;

import java.util.Objects;

/**
 * 美国间谍
 */
public class AmericanSpy implements Spy{

    @Override
    public void handler(String noticeMsg, MsgType msgType) {
        if(Objects.equals(msgType, MsgType.CLOSE)) {
            System.out.println("山上彻也正在迅速靠近...一切就绪...over");
        }else if(Objects.equals(msgType, MsgType.FIRE)) {
            System.out.println("山上彻也开火了，目标已击毙...over");
        }
    }
}
