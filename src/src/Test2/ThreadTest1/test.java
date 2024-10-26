package Test2.ThreadTest1;

import java.util.concurrent.atomic.AtomicInteger;

public class test {
    public static void main(String[] args) throws Exception {
        AtomicInteger total = new AtomicInteger(100);
        Thread1 red = new Thread1(total,"red");

        Thread1 ming = new Thread1(total,"ming");

        red.start();
        ming.start();
        red.join();
        ming.join();

        System.out.println("red发放了" + red.getCount() +"个礼物");
        System.out.println("ming发放了" + ming.getCount() +"个礼物");
    }
}
