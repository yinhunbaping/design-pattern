package org.example.factory.observer;

public class Main {
    public static void main(String[] args) {
        // 创建美国间谍
        AmericanSpy americanSpy = new AmericanSpy();
        // 创建韩国间谍
        KoreaSpy koreaSpy = new KoreaSpy();

        // 创建日本被观察者对象
        JapanObserver japanObserver = new JapanObserver();

        // 将美国、韩国间谍派遣到日本
        japanObserver.addObserver(koreaSpy);
        japanObserver.addObserver(americanSpy);

        // 日本宣布首相演讲时间
        japanObserver.primeLecture();
        System.out.println("==================================");
        // 日本宣布首相已入场
        japanObserver.primePresent();

        // 监听事件触发完毕, 后置处理
        System.out.println("==================================");
        System.out.println("间谍撤场");
    }
}
