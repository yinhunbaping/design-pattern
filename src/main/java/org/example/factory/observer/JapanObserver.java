package org.example.factory.observer;

/**
 * 具体的被观察者（日本）
 */
public class JapanObserver extends AbstractNation{

    /**
     * 首相选举演讲
     */
    public void primeLecture() {
        String msg = "通知: 2022年（令和4年）7月8日, 日本首相晋三将在奈良市进行选举演讲，望广大市民积极参与现场投票！！";
        System.out.println(msg);
        // 该条消息被间谍捕获，迅速通知
        this.notifyObserver(msg, MsgType.CLOSE);
    }

    public void primePresent() {
        String msg = "通知: 晋三首相已经到场，各位市民请注意秩序！！！";
        System.out.println(msg);
        // 首相到场，间谍迅速通知
        this.notifyObserver(msg, MsgType.FIRE);
    }
}
