package Test1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class num2Demo {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:" +
                "刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01" +
                "#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        fun2(fun1(userStrs));
    }

    public static List<User> fun1(String userStrs){
        List<User> users = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String[] data= userStrs.split("#");
        for (String s : data) {
            String[] sp =s.split(":");
            Long id = Long.valueOf(sp[0]);
            String gender = sp[2];
            LocalDate birth = LocalDate.parse(sp[3],dtf);
            String name = sp[1];
            users.add(new User(id,gender,birth,name));
        }
        return users;
    }

    public static void fun2(List<User> users){
        Map<String,Integer> stat = new HashMap<>();
        for (User user : users) {
            if (stat.containsKey(user.getName())){
                stat.put(user.getName(),stat.get(user.getName())+1);
            }else{
                stat.put(user.getName(),1);
            }
        }
        Set<Map.Entry<String,Integer>> entries = stat.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue()+"次");
        }
    }
}
