package H_InnerClassDemo;

public class Outer {
    public int age = 100;
    public static String name = "gs";
    public class Inner{
        private String name;
        private int age = 18;
        public void test(){
            int age = 0;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
        //JDK16开始才支持定义内部类静态成员。
        //public static String ability;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
