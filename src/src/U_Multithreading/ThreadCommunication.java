package U_Multithreading;

public class ThreadCommunication {
    public static void main(String[] args) {
        //线程通信：当多个线程共同操作共享的资源时，线程之间通过某种方式互相告知自己的状态，以相互协调，并避免无效的资源争夺。
        //         常见模型：生产者模型与消费者模型：生产者负责生产数据，消费者线程负责消费生产者生产的数据。
        //                                     生产者生产完数据应该等待自己，通知消费者消费；消费者消费完数据也应该等待自己，再通知生产者生产。
        //          Object类的等待和唤醒方法：void wait()  让当前线程等待并释放所占锁，直到另一个线程调用notify（）方法或notifyAll()方法
        //                                void notify()  唤醒正在等待的单个线程
        //                                void notifyAll()  唤醒正在等待的所有线程
        //                                上述方法应该使用当前同步锁对象进行调用
        Desk desk = new Desk();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"厨师1").start();
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"厨师2").start();
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"厨师3").start();


        new Thread(() -> {
            while (true) {
                desk.get();
            }
        },"吃货1").start();
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        },"吃货2").start();


    }
}
