package U_Multithreading;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //public Thread(String name)为当前线程指定名称
        Thread t1 = new MyThread("线程1");
        //public void start()启动线程
        t1.start();
        //public String getName()获取当前线程的名称，线程默认是Thread-索引
        System.out.println(t1.getName());

        Thread t2 = new MyThread();
        //pubiic void setName(String name)为线程设置名称
        t2.setName("线程2");
        t2.start();
        //主线程对象的名称
        //public static Thread current Thread()获取当前执行的线程对象
        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());

        for (int i = 0; i < 3; i++) {
            System.out.println("main线程输出" + i);
        }

        //Thread常见的构造器
        //pubiic void setName(String name)为线程设置名称
        //public Thread(Runnable target)封装Runnable对象成为线程对象
        //public Thread(Runnable target,String name)封装Runnable对象成为线程对象，并指定线程名称
    }
}
