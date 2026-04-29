package ch11.answer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Answer07 {
    static void main() {
        Map<String,Student> studentMap = new HashMap<>();
        studentMap.put("장동건",new Student("장동건",3.4));
        studentMap.put("원빈",new Student("원빈",3.9));
        studentMap.put("현빈",new Student("현빈",4.1));
        studentMap.put("고수",new Student("고수",3.25));
        double scholarship = 3.1;
        Set<String> keySet = studentMap.keySet();
        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()){
            Student student = studentMap.get(iterator.next());
            if(student.score>scholarship) {
                System.out.print(student.name+",");
            }
        }
        System.out.println();
        Set<Map.Entry<String,Student>> entrySet = studentMap.entrySet();
        Iterator<Map.Entry<String,Student>> iterator02 = entrySet.iterator();
        while (iterator02.hasNext()) {
            Map.Entry<String,Student> entry = iterator02.next();
            Student student = entry.getValue();
            String str =  entry.getKey();
            if(student.score>scholarship) {
                System.out.println(student.name);
            }
        }

    }
}
