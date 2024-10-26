package W_JavaAdvance.ReflectionDemo;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class FrameCase {
    //需求：对于任意一个对象，该框架都刻意把对象的字段名和对应的值，保存到文件中去。
    @Test
    public void save(Object o) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("javaLearn/src/src/JavaAdvance/ReflectionDemo",true));
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
