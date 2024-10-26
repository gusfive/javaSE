package J_genericsDemo.genericsClass;

import J_genericsDemo.*;

public class genericsClass {
    public static void main(String[] args) {
        MyArraylist<String> list = new MyArraylist();
        //list.add(3);
        list.add("你好");
        String ele = list.get(0);
        System.out.println(ele);

        MyClass<String,String> c = new MyClass<String,String>();
        MyClass2<Cat> cat = new MyClass2<Cat>();
        MyClass2<Dog> dog = new MyClass2<Dog>();
        MyClass2<Animal> animal = new MyClass2<Animal>();
    }
}
