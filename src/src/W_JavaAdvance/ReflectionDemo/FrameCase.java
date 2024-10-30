package W_JavaAdvance.ReflectionDemo;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class FrameCase {
    //需求：对于任意一个对象，该框架都刻意把对象的字段名和对应的值，保存到文件中去。
//    @Test  此方法有参有返回值，所以不能直接用注解，可以再定义一个无参无返回的专门测试方法，在方法内确定测试方法的参数和返回值等
    public void save(Object o) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("javaLearn/src/src/W_JavaAdvance/ReflectionDemo",true));
        Class c = o.getClass();
        String class1 = c.getSimpleName();
        ps.println(class1);
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String value = field.get(o) + "";
            ps.println(name + "=" + value);
        }
        ps.close();
    }
}
