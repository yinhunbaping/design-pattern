package org.example.factory.factory.simplefactory;

import org.example.factory.factory.Human;
import org.example.factory.factory.WhiteRace;
import org.example.factory.factory.YellowRace;

public class SimpleFactory {
    public static Human createInstance(String type) {
        if("yellowRace".equals(type)) {
            return new YellowRace();
        }else if("whiteRace".equals(type)){
            return new WhiteRace();
        }

        throw new RuntimeException("type["+type+"]类型不可识别，没有匹配到可实例化的对象！");
    }
}
