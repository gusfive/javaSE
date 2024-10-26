package I_EnumDemo;
//抽象枚举
public enum B {
    X(){
        @Override
        public void go() {

        }
    },Y(){
        @Override
        public void go() {

        }
    },Z(){
        @Override
        public void go() {

        }
    };

    private String name;

    public abstract void go();

    B() {
    }

    B(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
