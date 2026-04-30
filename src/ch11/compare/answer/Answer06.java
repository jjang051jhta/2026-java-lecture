package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer06 {
    static void main() {
        User02[] users = {
                new User02("kim", 30),
                new User02("lee", 20),
                new User02("kim", 22),
                new User02("park", 25)
        };
        //Arrays.sort(users);
        Arrays.sort(users,new UserAge02Comparator());
        System.out.println(Arrays.toString(users));
    }
}
class UserAge02Comparator implements Comparator<User02> {

    @Override
    public int compare(User02 o1, User02 o2) {
        int result = Integer.compare(o1.getAge(),o2.getAge());
        if(result==0) {
            return o1.getId().compareTo(o2.getId());
        }
        return result;
    }
}
class User02 implements Comparable<User02> {
    private String id;
    private int age;

    public User02(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User02 o) {
        int result = Integer.compare(this.age,o.age);
        if(result==0) {
            return this.id.compareTo(o.id);
        }
        return result;
    }
}
