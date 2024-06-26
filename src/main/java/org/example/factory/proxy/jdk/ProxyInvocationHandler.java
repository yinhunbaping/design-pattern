package org.example.factory.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理拦截器
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private final TargetInterface targetInterface;

    public ProxyInvocationHandler(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    public static Object createProxy(TargetInterface targetInterface) {
        return Proxy.newProxyInstance(targetInterface.getClass().getClassLoader(),
                targetInterface.getClass().getInterfaces(),
                new ProxyInvocationHandler(targetInterface));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理");
        Object result = method.invoke(targetInterface, args);
        System.out.println("后置处理");

        return result;
    }
}
