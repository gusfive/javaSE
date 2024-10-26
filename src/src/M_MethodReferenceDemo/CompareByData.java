package M_MethodReferenceDemo;

import Ka_ArraysDemo.Student;

public class CompareByData {
    public static int compareByAge(Student o1,Student o2){
        return o1.getAge()-o1.getAge();
    }

    public int compareByAgeDesc(Student o1,Student o2){
        return o2.getAge()-o1.getAge();
    }
}
