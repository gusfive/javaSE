package U_Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int id;
    private String password;
    private double money;
    private final Lock lk = new ReentrantLock();

    public Account() {
    }

    public Account(int id, String password, double money) {
        this.id = id;
        this.password = password;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(double m) {
        String name = Thread.currentThread().getName();
        lk.lock();
        try {
            if (this.money >= m){
                this.money -= m;
                System.out.println(name+"取钱成功，余额为"+this.money);
            }else {
                System.out.println("余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();
        }
    }
}
