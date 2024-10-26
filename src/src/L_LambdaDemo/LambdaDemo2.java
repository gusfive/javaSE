package L_LambdaDemo;

import Ka_ArraysDemo.Student;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        double[] prices = {99.8,128,100};
//        Arrays.setAll(prices, new IntToDoubleFunction() {
//            @Override
//            public double applyAsDouble(int value) {
//                return prices[value] * 0.8;
//            }
//        });
        Arrays.setAll(prices,(value) -> {return prices[value] * 0.8;});
        System.out.println(Arrays.toString(prices));
        System.out.println("----------------------");

        Student[] students = new Student[4];
        students[0] = new Student("gs",170,18);
        students[1] = new Student("wqr",169,24);
        students[2] = new Student("diga",999,999);
        students[3] = new Student("nb",0,0);

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //return (int) (o1.getAge()-o2.getAge());
////                if (o1.getHeight() > o2.getHeight()) {
////                    return 1;
////                }
////                else if (o1.getHeight() < o2.getHeight()) {
////                    return -1;
////                }
////                else return 0;
//                return Double.compare(o1.getHeight(),o2.getHeight());
//            }
//        });

        Arrays.sort(students,(o1,o2) -> {return Double.compare(o1.getHeight(),o2.getHeight());});
        System.out.println(Arrays.toString(students));


    }
}
