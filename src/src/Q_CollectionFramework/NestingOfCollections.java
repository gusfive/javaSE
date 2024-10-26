package Q_CollectionFramework;

import java.util.*;

public class NestingOfCollections {
    public static void main(String[] args) {
        //集合的嵌套：集合中的元素是另一个集合
        List<String> js = new ArrayList<>();
//        js.add("南京市");
//        js.add("扬州市");
//        js.add("苏州市");
//        js.add("无锡市");
//        js.add("常州市");
        Collections.addAll(js,"南京市","扬州市","苏州市","无锡市","常州市");
        Map<String, List<String>> province = new HashMap<>();
        province.put("江苏省",js);

        List<String> cities = province.get("江苏省");
        System.out.println(cities);
        for (String city : cities) {
            System.out.println(city);
        }

        cities.forEach(System.out::println);

    }
}
