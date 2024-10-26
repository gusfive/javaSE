package Q_CollectionFramework;

public class Card {
    private String color;
    private String num;

    public Card() {
    }

    public Card(String color, String num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return color + num+' ';
    }
}
