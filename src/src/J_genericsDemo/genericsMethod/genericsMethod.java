package J_genericsDemo.genericsMethod;

import J_genericsDemo.genericsClass.Dog;

import java.util.ArrayList;

public class genericsMethod {
    public static void main(String[] args) {
        String rs = test("java");
        System.out.println(rs);

        Dog d = test(new Dog());
        System.out.println(d);

        //需求：所有的汽车可以一起参加比赛。
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(new BMW());
//        cars.add(new BENZ());
//        go(cars);
//        //但是这样不行，如下
//        ArrayList<BMW> bmws = new ArrayList<>();
//        bmws.add(new BMW());
//        bmws.add(new BMW());
//        //go(bmws);//报错
//    }
//
//    public static void go(ArrayList<Car> cars){}
//      利用泛型方法就可以实现
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);
        //但是会有其他问题，比如不是汽车的类也可以加进来
//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);
        //需要使泛型方法里的泛型继承Car类
  }
    //public static <T> void go(ArrayList<T> t){}
    public static <T extends Car> void go(ArrayList<T> cars){}
    //通配符?,在使用泛型的时候可以代表一切类型 ? extends Car(上限，？只能是Car及其子类) ? super Car(下限，？只能是Car及其父类)
    public static void go1(ArrayList<? extends Car> cars){}

    public static <T> T test (T t){
        return  t;
    }
}
