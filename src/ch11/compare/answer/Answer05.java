package ch11.compare.answer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Answer05 {
    static void main() {
        User[] users = {
                new User("kim", 30),
                new User("lee", 20),
                new User("kim", 22),
                new User("park", 25)
        };
        //Arrays.sort(users);
        Arrays.sort(users,new UserComparator());
        System.out.println(Arrays.toString(users));
    }
}
class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result = o1.getId().compareTo(o2.getId());
        if(result==0) {
            return Integer.compare(o1.getAge(),o2.getAge());
        }
        return result;
    }
}
class User implements Comparable<User> {
    private String id;
    private int age;

    public User(String id, int age) {
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
    public int compareTo(User o) {
        int result = this.id.compareTo(o.id);
        if(result==0) {
            return Integer.compare(this.age,o.age);
        }
        return result;
    }
}
