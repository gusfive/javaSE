package U_Multithreading;

import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        //线程：（Thread）一个程序内部的一条执行流程。
        //程序中如果只有一条执行流程，那么这个程序就是单线程的程序。
        //多线程：从软硬件上实现的多条执行流程的技术（多条线程由CPU负责调度执行）。

        //在程序中创建出多条线程：
        //  java是通过java.lang.Thread类的对象来代表线程的

        //方法一：继承Thread类
        //1.让子类继承Thread线程类 2.重写Thread类的run方法
        //3.创建该子类的对象代表一个线程
        Thread t = new MyThread();
        //4.启动线程
        t.start();//现在有main线程和t线程
        //优点：编码简单
        //缺点：线程类已经继承Thread，无法继承其他类，不利于功能的扩展
        //注意事项：1.启动线程必须调用start方法而不是run方法 2.不要把主线程任务放在启动子线程之前

        //方法二：实现Runnable接口
        //1.定义一个任务类，实现Runnable接口 2.重写Runnable的run方法
        //3.创建任务对象
        Runnable target = new MyRunable();
        //4.任务对象交给一个线程对象处理
        //5.调用线程对象的start（）方法启动线程
        new Thread(target).start();
        //优点：任务类只是实现接口，可以继承其他类、实现其他接口，扩展性强
        //缺点：需要多一个Runnable对象
        //扩展：方法二的匿名内部类写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("2.匿名内部类输出"+i);
                }
            }
        }).start();
        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
            System.out.println("3.LAMBDA输出"+i);
        }
        }).start();

        //方法三：实现Callable接口
        //特点：可以返回线程执行完毕后的结果
        //1.创建任务对象
        //  定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
        //  把Callable类型的对象封装成FutureTask(线程任务对象)。
        //FutureTask对象其实实现了Runnable对象
        FutureTask FT = new FutureTask<>(new MyCallable(10));
        //2.把线程任务对象交给Thread对象
        Thread t3 = new Thread(FT);
        //3.调用Thread对象的start方法启动线程
        t3.start();
        //4.线程执行完毕后、通过FutureTask对象的get方法去获取线程任务执行的结果。
        //如果执行到此处上面的线程仍未执行完毕，这里的代码会暂停，等待上面线程执行完毕后才会获取结果。
        System.out.println("线程FT运行的结果是"+FT.get());
        //优点；线程任务类只是实现接口，可以继承类和实现接口，扩展性强；可以在线程执行完毕后去获取线程执行的结果。
        //缺点：编码相对复杂一些

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+i);
        }

    }
}
