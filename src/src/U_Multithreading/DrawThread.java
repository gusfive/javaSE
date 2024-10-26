package U_Multithreading;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);//super(name) 的作用是调用父类（即 Thread 类）的构造器，并传递参数 name。
        // 这是因为 DrawThread 类继承了 Thread 类，而 Thread 类有一个构造器 Thread(String name)，用于设置线程的名称
        this.acc = acc;
    }
    @Override
    public void run(){
        acc.drawMoney(10000);
    }
}
