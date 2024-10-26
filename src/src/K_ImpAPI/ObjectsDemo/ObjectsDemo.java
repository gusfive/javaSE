package K_ImpAPI.ObjectsDemo;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        //Objects是一个工具类，提供了很多操作对象的静态方法给我们使用。
        String s1 = "gs";
        String s2 = "gs";
        String s3 = null;

        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        //System.out.println(s3.equals(s1));
        System.out.println(Objects.equals(s3, s1));//更安全

        System.out.println(Objects.isNull(s1));
        System.out.println(s3 == null);
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.nonNull(s3));
    }
}
