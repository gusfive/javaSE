package U_Multithreading;

public class ConcurrencyParallelism {
    public static void main(String[] args) {
        //进程：正在运行的程序（软件）就是一个独立的进程。
        //      线程是属于进程的，一个进程中可以同时运行很多个进程。
        //      进程中的多个线程其实是并发和并行执行的。
        //并发：进程中的线程是由CPU负责调度执行的，但CPU能同时处理线程的数量有限，为了保证全部线程都能往前执行，CPU会轮询为系统的每个线程服务，
        //      由于CPU切换的速度很快，给我们的感觉这些线程在同时执行，这就是并发。
        //并行：在同一时刻上，同时有多个线程在被CPU调度执行。

        //线程的生命周期
        //      线程从开始到结束的过程中，经历的各种状态及状态转换。
        //      JAVA线程有六种状态，都定义在Thread类的内部枚举类State中
        //          NEW(新建)，RUNNABLE（可运行）,BLOCKED（锁阻塞）,WAITING（无限等待）,TIMED_WAITING（计时等待）,TERMNATED（被终止）

    }
}
