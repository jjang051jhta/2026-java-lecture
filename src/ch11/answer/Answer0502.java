package ch11.answer;

import java.util.*;

public class Answer0502 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Map<String,Student> studentList = new HashMap<>();
        studentList.put("장동건",new Student("장동건","모바일",1,3.4));
        studentList.put("원빈",new Student("원빈","데이터베이스",2,3.9));
        studentList.put("현빈",new Student("현빈","자동차",3,4.1));
        studentList.put("고수",new Student("고수","화학",4,3.25));
        Set<String> keySet = studentList.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(studentList.get(iterator.next().toString()));
        }

        for(Map.Entry<String,Student> entry:studentList.entrySet()) {
            String key = entry.getKey();
            Student value= entry.getValue();
            System.out.println(key+": "+value.toString());
        }
        while(true) {
            System.out.println("이름을 입력하세요.");
            String name = scanner.nextLine();
            if(name.equals("그만")) break;
            Student findedStudent = studentList.get(name);
            System.out.println(findedStudent.name+","+findedStudent.department+","+findedStudent.id+","+findedStudent.score);
        }
    }
}
