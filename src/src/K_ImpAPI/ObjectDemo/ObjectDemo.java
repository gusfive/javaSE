package K_ImpAPI.ObjectDemo;

public class ObjectDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Object类是java所有类的祖宗类，因此，JAVA中所有类的对象都可以直接使用Object类中提供的一些方法。
        Student s1 = new Student("gs",24);
        //返回对象的字符串表示形式（constructor重写toString）
        System.out.println(s1.toString());
        System.out.println(s1);

        Student s2 = new Student("gs",24);
        //默认判断的是地址，需要重写
        System.out.println(s2.equals(s1));
        System.out.println(s1 == s2);

        //clone需要先继承Cloneable声明接口,再重写clone方法。最后抛出（throw）
        Student s3 = (Student) s1.clone();
        System.out.println(s3);
        System.out.println(s3 == s1);
        System.out.println(s3.equals(s1));
        //浅克隆：拷贝出的新对象，与原数据中的的数据一模一样（引用类型数据拷贝的只是地址）
        //深克隆：对象中基本类型的数据直接拷贝，对象中的字符串数据拷贝的还是地址，对象中还包含的其他对象，不会拷贝地址，会创建新对象。
    }
}
