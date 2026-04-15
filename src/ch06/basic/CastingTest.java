package ch06.basic;

public class CastingTest {
    static void main() {
        //자식을 부모타입으로 변경 up-casting
        Parent poly = new Child();
        // 부모를 자식타입으로 변경 down-casting
        Child child = (Child)poly;
        child.childMethod();
    }
}
