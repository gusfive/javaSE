package U_Multithreading;

public class getMoneyCase {
    public static void main(String[] args) {
        Account acc = new Account(123456,"123456",100000);
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

    }
}
