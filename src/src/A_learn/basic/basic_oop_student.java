package A_learn.basic;

public class basic_oop_student {
    String name;
    double chinese;
    double math;

    public void printTotalScore(){
        System.out.println("total score = "+(chinese+math));
    }

    public void printAverageScore(){
        System.out.println("average score = "+(chinese+math)/2);
    }
}
