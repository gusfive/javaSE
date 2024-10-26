package U_Multithreading;

public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "666--");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
