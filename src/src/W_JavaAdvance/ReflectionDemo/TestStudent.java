package W_JavaAdvance.ReflectionDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestStudent {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        System.out.println(c1.getName());//全类名
        System.out.println(c1.getSimpleName());//类名

        Class c2 = Class.forName("W_JavaAdvance.ReflectionDemo.Student");
        System.out.println(c1 == c2);

        Student s11 = new Student();
        Class c3 = s11.getClass();
        System.out.println(c1 == c3);

        Constructor[] constructors = c1.getConstructors();//获得类的全部构造器(public修饰)
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "---" + constructor.getParameterCount());//getParameterCount拿到构造器参数数量
        }

        Constructor[] constructors1 = c1.getDeclaredConstructors();//获得类的全部构造器
        for (Constructor constructor : constructors1) {
            System.out.println(constructor.getName() + "---" + constructor.getParameterCount());
        }

//        Constructor constructor11 = c1.getConstructor();//获取某个构造器（public）修饰的
        Constructor constructor22 = c1.getDeclaredConstructor(String.class,int.class);//获取某个构造器
        System.out.println(constructor22.getName() + "---" + constructor22.getParameterCount());
        Student s1 = (Student) constructor22.newInstance("gs",18);//调用此构造器对象表示的构造器，并传入参数，完成对象的初始化并返回

        Constructor constructor33 = c1.getDeclaredConstructor();//获取某个构造器
        constructor33.setAccessible(true);//设置为true，表示禁止检查访问控制（暴力反射）
        Student s2 = (Student) constructor33.newInstance();

        //获取类中的成员变量
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " +field.getType());
        }

        Field field = c1.getDeclaredField("name");
        System.out.println(field.getType());

        Student s = new Student();
        field.setAccessible(true);
        field.set(s,"gs");
        System.out.println(s);

        //获取类中的方法
        Method eat = c1.getDeclaredMethod("eat",String.class);//获取类中指定形参的方法
        System.out.println(eat.getName() + " " + eat.getParameterCount() + " " + eat.getReturnType());

        eat.setAccessible(true);
        Object rs = eat.invoke(s,"火锅");//调用方法，使用对象触发
        System.out.println(rs);

    }
}
