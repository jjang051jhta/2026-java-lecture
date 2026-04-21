package ch07.review;

public class ImmutableObject {
    static void main() {
        Address address01 = new Address("일산");
        Address address02 = new Address("부산");  //참조가 이루어 진다.
        Address changeAddress02 = address02.newSetValue("서울");
        //System.out.println(address02 == address02.newSetValue("서울"));
        //address02.setValue("부산"); //side effect
        System.out.println(address01.getValue());
        System.out.println(address02.getValue());
        System.out.println(changeAddress02.getValue());
        //가변객체
    }


}
class Address {
    private final String value;
    //생성자 주입 방식  spring가면 나온다
    public Address(String value) {
        this.value = value;
    }
    public Address newSetValue(String value) {
        return new Address(value);
    }
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}