package org.example.factory.chain;

public class Main {
    public static void main(String[] args) {
        ChainManager chainManager = new ChainManager();

        // 提交审批
        chainManager.submitAudit();
    }
}
