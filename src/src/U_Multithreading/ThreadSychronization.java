package U_Multithreading;

public class ThreadSychronization {
    public static void main(String[] args) {
        //线程同步：解决线程安全问题的方案。让多个线程实现先后依次访问共享资源，这样就解决了安全问题。
        //      常见方案：加锁：每次只允许一个线程加锁，加锁后才能进入访问，访问完毕后自动解锁，然后其他线程才能再加锁进来。
        //                  1.同步代码块：把访问共享资源的核心代码给上锁以此保证线程安全。
        //                     synchronized () {} 小括号中要求是共享资源而不是随意的一个唯一对象，实例方法中this。静态方法中类名.class。

        //                  2.同步方法：把访问共享资源的核心方法给上锁以此保证线程安全。(隐含一个锁,实例this，静态类名.class)
        //                      修饰符 synchronized 返回值类型 方法名称（形参列表）{
        //                      操作共享资源的代码
        //                      }

        //                  3.Lock锁：JDK5开始提供的一个新的锁定操作，通过它可以创建出锁对象进行加锁和解锁，更灵活、更方便、更强大
        //                          Lock是接口，不能实例化，可以采用它的实现类ReentrantLock来构建Lock锁对象
        //                          实例方法：创建Lock对象，相应的部分lock和unlock，注意为了保证unlock必定执行，使用try-catch-finally

        //                  注意事项：对于当前同时执行的线程来说，同步锁必须是同一把（同一个对象），否则会出BUG
    }
}
