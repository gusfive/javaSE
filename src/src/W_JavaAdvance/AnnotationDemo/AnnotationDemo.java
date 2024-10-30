package W_JavaAdvance.AnnotationDemo;

public class AnnotationDemo {
    public static void main(String[] args) {
        //注解：java中的特殊标记，比如：@Override,@Test等
        //  作用：让其他程序根据注解信息来决定怎么执行该程序
        //  注意：注解可以用在类上、构造器上、方法上、成员变量上、参数上、等位置处。
        //  自定义注解：自己定义注解。
        //      public @interface 注解名称{
        //          public 属性类型 属性名（） default 默认值；
        //      }
        //  特殊属性名：value
        //      如果注解中只有一个value属性，使用注解时，value名称可以不写
        //  原理：注解本质是一个接口，java中所有的注解都是继承了Annotation接口的。
        //      @注解（...）：其实就是一个实现类对象，实现了该注解以及Annotation接口。

        //元注解：修饰注解的注解。
        //  @Target
        //      作用：声明被修饰的注解只能在哪些位置使用。
        //      @Target（{ElementType.TYPE，Element.FIELD}）
        //      1.TYPE,类，接口
        //      2.FIELD，成员变量
        //      3.METHOD，成员方法
        //      4.PARAMETER，方法参数
        //      5.CONSTRUCTOR，构造器
        //      6.LOCAL_VARIABLE，局部变量
        //  @Retention
        //      作用：声明注解的保留周期
        //      @Retention(RetentionPoilcy.RUNTIME)
        //      1.SOURCR    只作用在源码阶段，字节码文件中不存在。
        //      2.CLASS（默认值）  保留到字节码文件阶段，运行阶段不存在
        //      3.RUNTIME（开发常用）  一直保留到运行阶段

        //注解的解析
        //  判断类上、方法上、成员变量上是否存在注解，并把注解里的内容给解析出来。
        //  要解析谁上面的注解，就应该先拿到谁。
        //      比如要解析类上的注解，则应该先获取该类的Class对象，再通过Class对象解析其上面的注解。
        //      要解析成员方法上的注解，则应该获取到该成员方法的Method对象，再通过Method对象解析其上面的注解。
        //      Class、Method、Field、Constructor、都实现了AnnotatedElement接口，它们都拥有解析注解的能力。
        //   public Annotation[] getDeclaredAnnotations() 获取当前对象上面的注解
        //   public T getDeclaredAnnotation(Class<T> annotationClass) 获取指定的注解对象
        //   public boolean isAnnotationPresent(Class<Annotation> annotationClasss) 判断当前对象上是否存在某个注解

        //注解的应用场景
        //
    }
}
