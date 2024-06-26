package org.example.factory.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 设置需要被代理的类
        enhancer.setSuperclass(Hello.class);
        // 设置回调拦截器
        enhancer.setCallback(new ProxyInterceptor());
        // 创建代理对象
        Hello hello = (Hello) enhancer.create();
        // 调用代理对象方法
        hello.sayHello();
    }
}
