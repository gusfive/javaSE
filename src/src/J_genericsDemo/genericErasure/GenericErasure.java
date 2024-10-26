package J_genericsDemo.genericErasure;

import java.util.ArrayList;

public class GenericErasure {
    public static void main(String[] args) {
        //泛型是工作在编译阶段的，一旦程序编译成CLASS文件，CLASS文件中就不存在泛型了，这就是泛型擦除（泛型就是写代码时的约束）
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        String rs = list.get(2);
        System.out.println(rs);//反编译后ArrayList后面没有String，rs时进行强转。

        //泛型不支持基本数据类型，只能支持对象类型（引用数据类型）
        //ArrayList<int> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
    }
}
