package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CasesLandlords {
    public static void main(String[] args) {
        Card[] c1 = new Card[17];
        Card[] c2 = new Card[17];
        Card[] c3 = new Card[17];
        Card[] c4 = new Card[3];
        List<Card> c = cleanCards();
        for (int i = 0; i < c.size(); i++) {
            switch (i / 17){
                case 0:
                    c1[i] = c.get(i);
                    break;
                case 1:
                    c2[i - 17] = c.get(i);
                    break;
                case 2:
                    c3[i - 34] = c.get(i);
                    break;
                default:
                    c4[i - 51] = c.get(i);
            }
        }
        List<Card> c5 =  c.subList(c.size() - 3,c.size());//sublist：截取指定索引范围的集合
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        System.out.println(Arrays.toString(c3));
        System.out.println(Arrays.toString(c4));
        System.out.println(Arrays.toString(c5.toArray()));
    }

    public static List<Card> cleanCards(){
        String[] color = {"黑桃","红桃","方块","梅花"};
        String[] num = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        List<Card> cards = new ArrayList<>();
        Collections.addAll(cards,new Card("大","王"),new Card("小","王"));
        for (String i : color) {
            for (String j : num) {
                cards.add(new Card(i,j));
            }
        }
        Collections.shuffle(cards);
        return cards;
    }
}
