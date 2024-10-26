package W_JavaAdvance.AnnotationDemo;

import java.lang.reflect.Method;

/*
*目标：模拟Junit框架的设计
*/
public class AnnotationTest4 {
//    @MyTest
    public void test1(){
        System.out.println("test1");
    }

    @MyTest
    public void test2(){
        System.out.println("test2");
    }

//    @MyTest
    public void test3(){
        System.out.println("test3");
    }

    @MyTest
    public void test4(){
        System.out.println("test4");
    }

    public static void main(String[] args) throws Exception {
        AnnotationTest4 a = new AnnotationTest4();
        //启动程序
        Class c = AnnotationTest4.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(a);
            }
        }
    }
}
