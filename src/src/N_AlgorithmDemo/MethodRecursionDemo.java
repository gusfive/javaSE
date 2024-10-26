package N_AlgorithmDemo;

public class MethodRecursionDemo {
    public static void main(String[] args) {
        //递归算法三要素
        //1.递归的公式：f(n) = f(n-1) * n;
        //2.递归的终结点：f(1)
        //3.递归的方向必须走向终结点

        System.out.println("阶乘结果是"+f(5));
        System.out.println(sum(100));
        System.out.println(mp(10));
        System.out.println(beerQuestion(4));
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else{
            return f(n-1)*n;
        }
    }

    public static int sum(int n){
        if (n == 1){
            return 1;
        }else {
            return sum(n-1) + n;
        }
    }

    public static int mp(int n){
        if (n == 1){
            return 1;
        }else {
            return 2*mp(n - 1) + 2;
        }
    }

     public static int beerQuestion(int money){
        int f1 = money / 2;
        return change(f1,f1,f1,f1);
     }

    public static int change(int top,int glass,int turn,int sum) {
        if (glass < 2 && top < 4){
            return sum;
        }
        turn = (glass / 2) + (top / 4);
        sum += turn;
        glass = turn + glass % 2;
        top = turn + top % 4;
        return change(top,glass,turn,sum);
    }
}
