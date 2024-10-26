package W_JavaAdvance.DynamicProxyDemo;

public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(this.name + "sings" + name);
        return "谢谢";
    }

    public void dance(){
        System.out.println(this.name + "dangcing");
    }
}
