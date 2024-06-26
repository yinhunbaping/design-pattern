package org.example.factory.observer;


import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * 抽象国家类(提供模板方法)
 */
public abstract class AbstractNation {

    private final List<Spy> spies = Lists.newArrayList();

    /**
     * 添加观察者
     */
    protected void addObserver(Spy observer) {
        if(Objects.isNull(observer)) {
            return;
        }

        this.spies.add(observer);
    }

    /**
     * 移出观察者
     */
    protected void removeObserver(Spy observer) {
        if(Objects.isNull(observer)) {
            return;
        }

        this.spies.remove(observer);
    }

    /**
     * 通知观察者
     */
    protected void notifyObserver(String notifyMsg, MsgType msgType) {
        if(CollectionUtils.isEmpty(spies)) {
            return;
        }

        this.spies.stream()
                .filter(Objects::nonNull)
                .forEach(observer -> observer.handler(notifyMsg, msgType));
    }
}
