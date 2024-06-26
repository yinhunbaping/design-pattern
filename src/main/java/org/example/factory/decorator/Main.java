package org.example.factory.decorator;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 领导要开始批评了
        LeadershipCriticize leadershipCriticize = new LeadershipCriticize();

        // 为了让大家情面上都好过，先装饰一下这段话，加个表扬装饰器
        PraiseDecorator praiseDecorator = new PraiseDecorator(leadershipCriticize);

        // 再加一个PUA装饰，让他做牛做马
        PUADecorator puaDecorator = new PUADecorator(praiseDecorator);

        // 装饰完毕后，开始批评
        System.out.println(puaDecorator.getCriticizeContent());
    }

    /**
     * I/O流中的装饰
     */
    public void test() {
        try(FileInputStream fileInputStream = new FileInputStream("D:\\hello.txt")) {
            // 使用缓冲输入流流装饰文件输入流
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // 再包一层，使用数据输入流装饰缓冲输入流
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);

        }catch (Exception e) {
            System.out.println("异常错误");;
        }

    }
}
