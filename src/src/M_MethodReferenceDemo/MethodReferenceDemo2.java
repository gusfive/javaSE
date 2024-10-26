package M_MethodReferenceDemo;

import java.util.Arrays;

public class MethodReferenceDemo2 {
    public static void main(String[] args) {
        //特定类型方法的引用：如果某个Lambda表达式里只是调用一个实例方法，并且前面参数列表中第一个参数是作为方法的主调，
        //                后面的所有参数都是作为该实例方法入参的则可以使用特定类型的方法引用。
        //类型::方法
        String[] names = {"body","angle","Andy","dlei","caocao","Babo","jack","Cici"};

        //默认是按照字符串的首字符编号进行升序排序
        //Arrays.sort(names);

        //要求：忽略首字母大小写进行排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
        //Arrays.sort(names,((o1, o2) -> o1.compareToIgnoreCase(o2)));
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
