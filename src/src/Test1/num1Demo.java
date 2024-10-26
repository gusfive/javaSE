package Test1;

import java.util.*;
import java.util.stream.Collectors;

public class num1Demo {
    public static void main(String[] args) {
    answer();
    }

    public static void answer(){
        //随机编号为1-200中选100个囚徒
        List<Integer> bianhao = new ArrayList<>();
        Map<Integer,Integer> prisoner = new HashMap<>();
        for (int i = 1; i < 201; i++) {
            bianhao.add(i);
        }
        Collections.shuffle(bianhao);
        List<Integer> bh =  bianhao.stream().limit(100).collect(Collectors.toList());
        for (int i = 1; i < 101; i++) {
            prisoner.put(i, bianhao.get(i - 1));
            }
        System.out.println(prisoner.get(64));
        //删除奇数位置，幸存者
        Map<Integer,Integer> p1 = new HashMap<>();
        p1.putAll(prisoner);
        int lo = 101;
        while (lo > 1) {
            for (int i = 1; i < lo + 1; i++) {
                if(i % 2 == 1){
                    p1.remove(i);
                }else{
                    Integer t = p1.get(i);
                    p1.remove(i);
                    int j = i / 2;
                    p1.put(j,t);
                }
            }
            lo = lo / 2 ;
        }
        Collection<Integer> only = p1.values();
        int poistion = (int)only.toArray()[0];
        System.out.println(poistion);
        Map<Integer,Integer> p2 = new HashMap<>();
        prisoner.forEach((s,v) -> p2.put(v,s));
        System.out.println(p2.get(poistion));
    }
}

