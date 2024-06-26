package org.example.factory.proxy.jdk;

public class TargetRunImpl implements TargetInterface{
    @Override
    public void doSomething() {
        System.out.println("我想跑");
        doRun();
    }

    public void doRun() {
        System.out.println("开跑咯");
    }
}
