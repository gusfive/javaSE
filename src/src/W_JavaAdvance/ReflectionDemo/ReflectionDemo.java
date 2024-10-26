package W_JavaAdvance.ReflectionDemo;

public class ReflectionDemo {
    public static void main(String[] args) {
        //反射：加载类，并允许以编程的方式解剖类中的各种成分（成员变量、方法、构造器等）。
        //  一、反射第一步：加载类，获取类的字节码：Class对象
        //      获取Class对象的三种方式
        //      1.Class c1 = 类名.class
        //      2.调用Class提供方法：public static Class forName(String package)
        //      3.Object提供的方法：public Class getClass(); Class c3 = 对象.getClass();

        //  二、获取类的构造器：Constructor对象
        //      1.获取全部构造器（只能获取public修饰的） Constructor<?>[] get Constructors()
        //      2.获取全部构造器（只要存在就能拿到）  Constructor<?>[] getDeclaredConstructors()
        //      3.获取某个构造器（只能获取public修饰的） Constructor<T> getConstructor(Class<?>...paramerTypes)
        //      4.获取某个构造器（只要存在就能拿到的）  Constructor<T> getDeclaredConstructor(Class<?>...parameterTypes)
        //      获取类构造器的作用：初始化对象返回
        //      T newInstance(Object...initargs)  调用此构造器对象表示的构造器，并传入参数，完成对象的初始化并返回
        //      public void setAccseeible(boolean flag)  设置为true，表示禁止检查访问控制（暴力反射）

        //  三、获取类的成员变量：Field对象
        //      1.获取类的全部成员变量（public）  public Field[] getFields()
        //      2.获取类的全部成员变量（全部）    public Field[] getDeclaredFields()
        //      3.获取类的某个成员变量（public）    public Field[] getField(String name)
        //      4.获取类的某个成员变量（全部）    public Field[] getDeclaredFields(String name)
        //      获取成员变量的作用：赋值 void set(Object obj,Object value)
        //                      取值 Object get(Object obj)
        //      public void setAccessible(boolean flag) 设置为true，表示禁止检查访问控制（暴力反射）

        //  四、获取类的成员方法：Method对象
        //      1.获取类的全部成员方法（public） Method[] getMethods()
        //      2.获取类的全部成员方法（全部）    Method[] getDeclaredMethods()
        //      3.获取类的某个成员方法（public）    Method getMethod(String name,Class<?>...parameterTypes)
        //      4.获取类的某个成员方法（全部）    Method getDeclaredMethod(String name,Class<?>...parameterTypes)
        //      作用：执行
        //      public Object invoke(Object obj,Object...args)  触发某个方法的执行
        //      public void setAccessible(boolean flag) 设置为true，表示禁止检查访问控制（暴力反射）

        //  反射的作用和应用场景
        //      基本作用：得到一个类的全部成分然后操作。
        //      破坏封装性
        //      最重要的用途：适合做JAVA的框架，基本上，主流的框架都会基于反射设计出一些通用的功能。
    }
}
