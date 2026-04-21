package ch07.lang.wrapper;

public class WrapperClassTest01 {
    static void main() {
        //int num = 10; //기본타입은 클래스가 아니다.
        Integer integer = new Integer(10); //기본 타입 int를 객체로 덮어 씌운 거 boxing 향후 쓰지 못하게 설정될 예정
        Integer intergerObject = Integer.valueOf(10);

        Double doubleObj = Double.valueOf(10.5);
        Character character = Character.valueOf('c');

        System.out.println("integer = "+integer); //값을 출룍할때 기본형으로 box를 벗겨서 출력 unboxing
        System.out.println("integerObject = "+intergerObject);
        System.out.println(integer == intergerObject); // 동일성 비교 false
        System.out.println(integer.equals(intergerObject)); // 동등성 비교 false


    }
}
