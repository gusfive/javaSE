package Test2.ThreadTest1;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 extends Thread{
    private  int count;
    private static AtomicInteger total;

    public Thread1(String name) {
        super(name);
    }

    public Thread1(AtomicInteger total,String name) {
        super(name);
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        while (true){
            synchronized (total){
                if (total.get() < 10){
                    break;
                }
                System.out.println(name + "发出了一份产品");
                total.decrementAndGet();
                count ++;
            }
        }
    }
}
