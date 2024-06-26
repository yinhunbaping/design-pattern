package org.example.factory.proxy.jdk;

public class TargetFlyImpl implements TargetInterface{
    @Override
    public void doSomething() {
        System.out.println("我想飞");
        doFly();
    }

    public void doFly() {
        System.out.println("起飞咯");
    }
}
