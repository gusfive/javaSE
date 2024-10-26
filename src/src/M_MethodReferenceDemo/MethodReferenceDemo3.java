package M_MethodReferenceDemo;

public class MethodReferenceDemo3 {
    public static void main(String[] args) {
        //构造器引用：类名：：new
        //如果某个lambda表达式里只是在创建对象，并且前后参数情况一致，就可以使用构造器引用。

        //1.创建这个接口的匿名内部类对象
//        CreaterCar cc= new CreaterCar(){
//            @Override
//            public Car create(String name, double price) {
//                return new Car(name,price);
//            }
//        };

        //CreaterCar cc = (name,price) -> new Car(name,price);

        CreaterCar cc = Car::new;
        Car c = cc.create("gs",1);
        System.out.println(c);

        Car c1 = new Car("wqr",0);
    }
}

interface CreaterCar{
    Car create(String name,double price);
}
