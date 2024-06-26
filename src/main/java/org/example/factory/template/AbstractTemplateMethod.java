package org.example.factory.template;

public abstract class AbstractTemplateMethod {
    protected abstract void laugh();

    protected abstract void cry();

    protected abstract void calm();

    private void run() {
        System.out.println("我要跑步");
    }
}
