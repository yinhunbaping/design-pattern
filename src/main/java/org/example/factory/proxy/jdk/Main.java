package org.example.factory.proxy.jdk;

public class Main {
    public static void main(String[] args) {
        TargetInterface targetFlyImpl = (TargetInterface) ProxyInvocationHandler.createProxy(new TargetFlyImpl());
        targetFlyImpl.doSomething();

        System.out.println("===============");

        TargetInterface targetRunImpl = (TargetInterface) ProxyInvocationHandler.createProxy(new TargetRunImpl());
        targetRunImpl.doSomething();

    }
}
