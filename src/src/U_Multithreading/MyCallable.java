package U_Multithreading;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    int sum;
    private int n;
    public MyCallable(int n){
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "的结果是" + sum;
    }
}
