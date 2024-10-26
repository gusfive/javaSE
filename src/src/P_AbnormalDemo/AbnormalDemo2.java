package P_AbnormalDemo;

public class AbnormalDemo2 {
    public static void main(String[] args) {
        //自定义异常：JAVA无法为全部问题提供异常类来代表，自己的问题想通过异常表示以便于管理问题，需要自己定义异常类
        //自定义运行时异常：定义一个异常类继承RuntimeException,重写构造器，通过throw new 异常类（XXX）来创建异常对象并抛出。
        //              编译阶段不报错，提醒不强烈，运行时才可能出现。
        //自定义编译时异常：定义一个异常类继承Exception,重写构造器，通过throw new 异常类（XXX）来创建对象并抛出。
        //              编译阶段就报错，提醒更加强烈。
        try {
            saveAge(160);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            saveAge1(-5);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    public static void saveAge(int age){
        if(age > 0 && age < 150){
            System.out.println("成功保存");
        }else{
            //用一个异常对象封装这个问题,throw抛出这个异常对象
            throw new AgeIllegalRuntimeException("年龄非法");
        }
    }

    public static void saveAge1(int age) throws AgeIllegalException {
        if(age > 0 && age < 150){
            System.out.println("成功保存");
        }else{
            //用一个异常对象封装这个问题,throw用在方法上，抛出方法内部的错误
            throw new AgeIllegalException("年龄非法");
        }
    }
}
