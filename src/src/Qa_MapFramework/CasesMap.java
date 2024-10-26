package Qa_MapFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CasesMap {
    public static void main(String[] args) {
        //统计投票人数：某班级80名学生，现在需要组织秋游活动，班长提供了四个景点（ABCD），每个学生只能选择一个景点，请统计最终哪个景点想去的人最多
        String[] jd = {"A","B","C","D"};
        ArrayList<String> data = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            data.add(jd[index]);
        }

        Map<String,Integer> result = new HashMap<>();
        for (String s : data) {
            if(result.containsKey(s)){
                result.put(s,result.get(s) + 1);
            }else{
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
