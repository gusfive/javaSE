package U_Multithreading;

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            //休眠5s
            if (i == 3){
                //public static void sleep(long time)让当前执行的线程休眠多少毫秒后，再继续执行
                Thread.sleep(5000);
            }
        }

        Thread t1 = new MyThread("线程1");
        t1.start();
        //public final void join()...让调用当前这个方法的线程先执行完
        t1.join();

        Thread t2 = new MyThread("线程2");
        Thread t3 = new MyThread("线程3");
        t2.start();
        t3.start();
        t3.join();
    }
}
