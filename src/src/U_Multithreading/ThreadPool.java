package U_Multithreading;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws Exception {
        //线程池：一个可以复用线程的技术。
        //          用户每发起一个请求，后台就需要创建一个新线程来处理，下次新任务来了肯定又要创建新线程处理，
        //      而创建新线程的开销很大，请求过多时，会有大量线程产生，影响系统性能
        //      JDL5.0起提供了代表线程池的接口：ExecutorService

        //如何得到线程池对象：方式一：使用ExecutorService的实现类ThreadPoolExcutor自创建一个线程池对象
        //                      参数1：int corePoolSize  指定线程池的核心线程的数量
        //                      参数2：int maxmumPoolSize  指定线程池的最大线程数量
        //                      参数3：long keepAliveTime  指定临时线程的存活时间
        //                      参数4：TimeUnit unit  指定临时线程存活的时间单位（秒、时、分、天）
        //                      参数5：BlockingQueue<Runnable> workQueue  指定线程池的任务队列 ArrayBlockingQueue:指定队列大小 LinkedBlockingQueue:无限大小
        //                      参数6：ThreadFactory threadFactory  指定线程池的线程工厂 new一个匿名内部类或者Executors的默认方法
        //                      参数7：RejectExecutionHandler handler  指定线程池的任务拒绝策略（线程都在忙，任务队列也满了的时候，新任务来了该怎么处理）
        //                      注意事项：新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程时，才会创建临时线程
        //                              核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始拒绝任务。
//        ExecutorService pool = new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());

        //      ExecutorService常用方法

//        //          执行Runnable方法
//        Runnable tatget = new MyRunnable1();
//        pool.execute(tatget);//void execute（Runnable command）执行Runnable任务，线程池会自动创建一个新线程，自动处理这个任务，自动执行
//        pool.execute(tatget);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
//        pool.execute(tatget);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
//        pool.execute(tatget);//复用前面的核心线程
//        pool.execute(tatget);//复用前面的核心线程
//        pool.execute(tatget);//复用前面的核心线程
//        pool.execute(tatget);//复用前面的核心线程
//        //到了创建临时线程的时机了
//        pool.execute(tatget);
//        pool.execute(tatget);
//        //到了新任务的拒绝时机了
//        pool.execute(tatget);
//        //新任务拒绝策略
//        //ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常，是默认的策略
//        //ThreadPoolExecutor.DiscardPolicy:丢弃任务，但是不抛出异常，不推荐的做法
//        //ThreadPoolExecutor.DiscardOldestPolicy:抛弃队列中等待最久的任务，然后把当前任务加入队列中
//        //ThreadPoolExecutor.CallerRunsPolicy:由主线程负责调用任务的run()方法从而绕过线程池直接执行
////        pool.shutdown();//等全部任务执行完毕后，再关闭线程池
////        pool.shutdownNow();//立刻关闭线程池，停止正在执行的任务，并返回队列中未执行的任务list<Runnable>

        //          执行Callable方法
        //      Future<T>  submit(Callable<T> task) 执行Callable任务,返回未来任务对象，用于获取线程返回的结果
//        Future<String> f1 = pool.submit(new MyCallable(100));
//        Future<String> f2 = pool.submit(new MyCallable(200));
//        Future<String> f3 = pool.submit(new MyCallable(300));
//        Future<String> f4= pool.submit(new MyCallable(400));
//
//        System.out.println(f1.get());
//        System.out.println(f2.get());
//        System.out.println(f3.get());
//        System.out.println(f4.get());

        //如何得到线程池对象：方式二：使用Executors(线程池的工具类)调用方法返回不同特点的线程池对象
        //Executors：一个线程池的工具类，提供了很多静态放啊用于返回不同特点的线程池对象。
        //这些方法的底层都是通过线程池的实现类ThreadPoolExecutor实现的
        //public static ExecuyorService newFixedThreadPool(int nThreads) 创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它
        //public static ExecutorService newSingleThreadExecutor() 创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程
        //public static ExecutorService newCachedThreadPool() 线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了60s则会被回收掉
        //public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)  创建一个线程池，可以实现给定的延迟后运行任务，或者定期执行任务
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //Executors使用可能存在的陷阱
        //大型并发环境中使用Executors如果不注意可能会出现系统风险：例如队列长度无限可能会导致堆积大量请求导致OOM

        //核心线程的配置问题
        //计算密集型任务：核心线程数量 = CPU的核数 + 1
        //IO密集型任务： 核心线程数量 = CPU的核数 * 2

    }
}
