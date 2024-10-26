package Test1;

import java.util.ArrayList;

public class num4Demo {
    public static void main(String[] args) {
        MyArrayList<Integer> mi = new MyArrayList<Integer>();
        mi.add(1);
        mi.add(2);
        mi.add(3);
        mi.remove(1);
        System.out.println(mi);
        System.out.println(mi.size());
        System.out.println(mi.get(1));
    }
}

