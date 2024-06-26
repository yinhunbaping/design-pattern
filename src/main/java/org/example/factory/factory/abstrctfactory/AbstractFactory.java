package org.example.factory.factory.abstrctfactory;

import org.example.factory.factory.Aeroplane;
import org.example.factory.factory.Human;
import org.example.factory.factory.Rocket;

/**
 * 抽象工厂接口
 */
public interface AbstractFactory {
    /**
     * 创建火箭
     */
    Rocket createRocket();

    /**
     * 创建飞机
     */
    Aeroplane createAeroplane();

    /**
     * 创建人类
     */
    Human createHuman();
}
