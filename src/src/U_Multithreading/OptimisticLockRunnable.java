package U_Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class OptimisticLockRunnable implements Runnable{
    //整数修改的乐观锁：原子类实现的。
    private AtomicInteger num = new AtomicInteger();

//    private int num;//记录浏览人次
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println("count =====>" + num.incrementAndGet());
        }
    }
}
