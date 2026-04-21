package ch07.lang.wrapper;

public class AutoboxingTest02 {
    static void main() {
        //Primitive ===> Wrapper
        Integer boxedValue =  7;
        //Wrapper ===> Primitive
        int unboxedValue =  boxedValue;
        System.out.println("boxedValue = "+boxedValue);
        System.out.println("onboxedValue = "+unboxedValue);

    }
}
