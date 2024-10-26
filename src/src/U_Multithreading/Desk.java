package U_Multithreading;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();

    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 0){
                list.add(name + "做的包子");
                System.out.println(name + "做了一个包子");
                Thread.sleep(2000);
                this.notifyAll();
                this.wait();
            }else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1){
                System.out.println(list.get(0).toString() + "被" + name + "拿走吃掉了");
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            }else {
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
