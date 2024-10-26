package U_Multithreading;

public class OptimisticLock {
    public static void main(String[] args) {
        //悲观锁、乐观锁
        //悲观锁：一上来就加锁，没有安全感。每次只能一个线程进入完毕后再解锁，线程安全，性能较差
        //乐观锁：一开始不上锁认为没有问题，大家一起跑，等要出现线程安全问题的时候才开始控制。线程安全，性能较好

        //  CAS算法：比较修改前的数据和修改后的数据

        //需求：1个变量，100个线程，每个线程对其加100次。
        Runnable target = new OptimisticLockRunnable();
        for (int i = 1; i < 101; i++) {
            new Thread(target).start();
        }
    }
}
