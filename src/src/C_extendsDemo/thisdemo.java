package C_extendsDemo;

public class thisdemo {
    private int num;
    private String name;
    private String des;

    public thisdemo(int num,String name,String des){
        this.num = num;
        this.name = name;
        this.des = des;
    }

    public thisdemo(int num,String name){
        this(num,name,"暂无");
    }

    public thisdemo(){
        this(0,"暂无");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
