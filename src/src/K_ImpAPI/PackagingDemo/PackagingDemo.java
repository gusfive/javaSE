package K_ImpAPI.PackagingDemo;

import java.util.ArrayList;

public class PackagingDemo {
    public static void main(String[] args) {
        //包装类：把基本类型的数据包装成对象。
        //byte-Byte short-Short int-Integer long-Long char-Character float-Float double-Double boolean-Boolean
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        //自动装箱：可以自动把基本类型的数据转换成对象。
        Integer a2 = 13;

        //自动拆箱：可以自动把包装类型的对象转换成对应的基本数据类型。
        int a3 = a2;

        //泛型和集合不支持基本数据类型，只能支持引用数据类型。
        //ArrayList<int> list1= new ArrayList<int>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(156);

        //包装类的其他操作：可以把基本类型的数据转换成字符串类型。
        Double d1 = 22.2;
        String rs1 = Double.toString(d1);
        System.out.println(rs1 + 1);
        //包装类的其他操作：可以把字符串类型的数值转换成数值本身对应的数据类型。
        String rs2 = "42";
        //int i1 = Integer.parseInt(rs2);
        int i1 = Integer.valueOf(rs2);
        System.out.println(i1 + 1);
    }
}