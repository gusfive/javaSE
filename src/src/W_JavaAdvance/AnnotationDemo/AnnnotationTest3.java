package W_JavaAdvance.AnnotationDemo;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnnotationTest3 {
    @Test
    public void parseClass(){
        //1.先得到class对象
        Class c = Demo.class;
        //2.解析类上的注解
        //判断类上是否包含某个注解
        if (c.isAnnotationPresent(MyTest3.class)){
            MyTest3 myTest3 = (MyTest3) c.getDeclaredAnnotation(MyTest3.class);
            System.out.println(myTest3.value());
            System.out.println(myTest3.aaa());
            System.out.println(Arrays.toString(myTest3.bbb()));
        }
    }

    @Test
    public void parseMethod() throws Exception {
        //1.先得到method对象
        Class c = Demo.class;
        Method method = c.getDeclaredMethod("test1");
        //2.解析类上的注解
        //判断方法上是否包含某个注解
        if (c.isAnnotationPresent(MyTest3.class)){
            MyTest3 myTest3 = (MyTest3) method.getDeclaredAnnotation(MyTest3.class);
            System.out.println(myTest3.value());
            System.out.println(myTest3.aaa());
            System.out.println(Arrays.toString(myTest3.bbb()));
        }
    }
}
