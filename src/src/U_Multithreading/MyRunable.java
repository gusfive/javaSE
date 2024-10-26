package U_Multithreading;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunable输出"+i);
        }
    }
}
